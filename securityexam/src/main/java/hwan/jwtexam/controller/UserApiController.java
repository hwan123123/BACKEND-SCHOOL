package hwan.jwtexam.controller;

import hwan.jwtexam.domain.RefreshToken;
import hwan.jwtexam.domain.Role;
import hwan.jwtexam.domain.User;
import hwan.jwtexam.dto.UserLoginResponseDto;
import hwan.jwtexam.jwt.util.JwtTokenizer;
import hwan.jwtexam.security.dto.UserLoginDto;
import hwan.jwtexam.service.RefreshTokenService;
import hwan.jwtexam.service.UserService;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserApiController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenizer jwtTokenizer;
    private final RefreshTokenService refreshTokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid UserLoginDto userLoginDto,
                                BindingResult bindingResult, HttpServletResponse response) {
        // username, password가 null일 때(정해진 형식에 맞지 않을 때)
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        // 일단은 username과 password 값을 잘 받아왔다면
        // 우리 서비스에 가입한 사용자 인지
        User user = userService.findUserByUsername(userLoginDto.getUsername());

        // 요청 정보에서 얻어온 비밀번호와 우리 서비스가 갖고있는 비밀번호가 일치하는지 확인

        if (!passwordEncoder.matches(userLoginDto.getPassword(), user.getPassword())) {
            // 비밀번호가 일치하지 않을 때
            return new ResponseEntity("비밀번호가 올바르지 않습니다.", HttpStatus.UNAUTHORIZED);
        }
        // 여기까지 왔다는 것은 유저도 있고, 비밀번호도 맞다.
        // 롤 객체를 꺼내서 롤의 이름만 리스트로 얻어온다.
        List<String> roles = user.getRoles().stream().map(Role::getName).collect(Collectors.toList());

        // 토큰 발급
        String accessToken = jwtTokenizer.createAccessToken(user.getId(), user.getEmail(), user.getName(), user.getUsername(), roles);
        String refreshToken = jwtTokenizer.createRefreshToken(user.getId(), user.getEmail(), user.getName(), user.getUsername(), roles);

        // 리프레시토큰을 디비에 저장
        RefreshToken refreshTokenEntity = new RefreshToken();
        refreshTokenEntity.setValue(refreshToken);
        refreshTokenEntity.setUserId(user.getId());

        refreshTokenService.addRefreshToken(refreshTokenEntity);

        // 응답으로 보낼 값들을 준비
        UserLoginResponseDto loginResponseDto = UserLoginResponseDto.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .userId(user.getId())
                .name(user.getName())
                .build();

        Cookie accessTokenCookie = new Cookie("accessToken", accessToken);
        accessTokenCookie.setHttpOnly(true); // 보완 (쿠키 값을 자바스크립트 곳에서는 접근할 수 없다)
        accessTokenCookie.setPath("/");
        accessTokenCookie.setMaxAge(Math.toIntExact(JwtTokenizer.ACCESS_TOKEN_EXPIRE_COUNT / 1000)); // 30분

        Cookie refreshTokenCookie = new Cookie("refreshToken", refreshToken);
        refreshTokenCookie.setHttpOnly(true);
        refreshTokenCookie.setPath("/");
        refreshTokenCookie.setMaxAge(Math.toIntExact(JwtTokenizer.REFRESH_TOKEN_EXPIRE_COUNT / 1000)); // 7일

        response.addCookie(accessTokenCookie);
        response.addCookie(refreshTokenCookie);

        return new ResponseEntity(loginResponseDto, HttpStatus.OK);
    }

    @GetMapping("/api/authtest")
    public String authtest() {
        return "authTest";
    }

    @PostMapping("/refreshToken")
    public ResponseEntity refreshToken(HttpServletRequest request, HttpServletResponse response) {
        // 할 일
        // 1. 쿠키로부터 리프레시토큰을 얻어온다.
        String refreshToken = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("refreshToken".equals(cookie.getName())) {
                    refreshToken = cookie.getValue();
                    break;
                }
            }
        }
        // 2-1. 없다. 오류로 응답
        if (refreshToken == null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        // 2-2 있을 때
        // 3. 토큰으로부터 정보를 얻어온다
        Claims claims = jwtTokenizer.parseRefreshToken(refreshToken);
        Long userId = Long.valueOf((Integer) claims.get("userId"));

        User user = userService.getUser(userId).orElseThrow(() -> new IllegalArgumentException("사용자를 찾지 못했습니다."));
        // 4. accessToken 생성
        List roles = (List) claims.get("roles");

        String accessToken = jwtTokenizer.createAccessToken(userId, user.getEmail(),
                user.getName(), user.getUsername(), roles);
        // 5. 쿠키 생성 response로 보내고
        Cookie accessTokenCookie = new Cookie("accessToken", accessToken);
        accessTokenCookie.setHttpOnly(true);
        accessTokenCookie.setPath("/");
        accessTokenCookie.setMaxAge(Math.toIntExact(JwtTokenizer.ACCESS_TOKEN_EXPIRE_COUNT / 1000));
        response.addCookie(accessTokenCookie);
        // 6. 적절한 응답결과(ResponseEntity)를 생성해서 응답
        UserLoginResponseDto responseDto = UserLoginResponseDto.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .name(user.getName())
                .userId(user.getId())
                .build();

        return new ResponseEntity(responseDto, HttpStatus.OK);
    }
}
