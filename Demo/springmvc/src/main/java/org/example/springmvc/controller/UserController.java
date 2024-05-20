package org.example.springmvc.controller;

import org.example.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/users")
    public String Users(Model model) {
        List<User> users = Arrays.asList(
                new User("Hwan", true),
                new User("Lee", false),
                new User("Kim", false),
                new User("Park", false),
                new User("Seo", false));

        model.addAttribute("users", users);
        return "users";
    }
}
