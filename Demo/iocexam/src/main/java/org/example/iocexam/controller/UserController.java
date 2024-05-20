package org.example.iocexam.controller;

import org.example.iocexam.domain.User;
import org.example.iocexam.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void joinUser() {
        // 실제 동작할 때는 사용자로부터 정보를 받아온다.
        User user = new User();
        user.setName("hwan");
        user.setEmail("hwan@gmail.com");
        user.setPassword("123456");

        userService.joinUser(user);
    }
}
