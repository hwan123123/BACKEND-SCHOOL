package hwan.filterexam2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HomeController {
    private final UserService userService;

//    public HomeController() {
//        log.info("HomeController 생성자 실행!");
//    }

    @GetMapping("/")
    public String home() {
        log.info("home() 실행");
        return "home";
    }

    @GetMapping("/hi")
    public String hi() {
        User user = UserContext.getUser();
        log.info("hi() "+user);
        return "hi";
    }

    @GetMapping("/hello")
    public String hello() {
        log.info("hello() 실행");
        return "hello";
    }
}
