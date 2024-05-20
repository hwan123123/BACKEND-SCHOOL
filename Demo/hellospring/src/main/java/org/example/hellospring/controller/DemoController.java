package org.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String main() {
        return "메인";
    }

    @GetMapping("/hi")
    public String hi() {
        return "안녕하세요";
    }

    @GetMapping("/mypage")
    public String mypage() {
        return "개인정보";
    }
}