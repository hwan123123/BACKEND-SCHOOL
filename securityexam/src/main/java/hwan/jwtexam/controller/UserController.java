package hwan.jwtexam.controller;

import hwan.jwtexam.domain.User;
import hwan.jwtexam.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userregform")
    public String userregform() {
        return "users/userregform";
    }

    @PostMapping("/userreg")
    public String userreg(@ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "users/userregform";
        }

        User byUsername = userService.findUserByUsername(user.getUsername());
        if (byUsername != null) {
            result.rejectValue("username", null, "이미 사용 중인 아이디입니다.");
            return "users/userregerror";
        }

        userService.register(user);
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "users/welcome";
    }

    @GetMapping("/loginform")
    public String loginform() {
        return "users/loginform";
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
