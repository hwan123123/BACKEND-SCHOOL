package org.example.springmvc.controller;

import org.example.springmvc.domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ExamController {
    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("welcomeMsg", "환영합니다~ spring MVC를 이용해보겠습니다.");

        List<Item> items = Arrays.asList(
                new Item("pen", 3000),
                new Item("notebook", 50000),
                new Item("cup", 2500)
        );

        model.addAttribute("itemList", items);

        return "welcome";
    }

    @GetMapping("/example")
    public String showExam(Model model) {
        model.addAttribute("username", "hwan");
        model.addAttribute("isAdmin", true);
        model.addAttribute("languages", new String[]{"English", "Spanish", "German"});

        return "exam";
    }

    // http://localhost/users 사용자 목록을 출력하세요.
    // 사용자 목록에서 사용자, 관리자 여부
    // -- 이 앖을 메시지프로퍼티를 이용해서 출력하도록 작성
    // Controller나 메서드명은 원하는대로 작성해도 좋습니다.
}
