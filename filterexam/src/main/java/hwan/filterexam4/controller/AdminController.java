package hwan.filterexam4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping
    public String admin() {
        return "admin";
    }

    @GetMapping("/access-denied")
    public String access() {
        return "access-denied";
    }
}
