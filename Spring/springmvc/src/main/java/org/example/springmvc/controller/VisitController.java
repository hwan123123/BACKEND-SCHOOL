package org.example.springmvc.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisitController {
    @GetMapping("/visit")
    public String showVisit(
            @CookieValue(name = "lastVisit", defaultValue = "N/A") String lastVisit,
            HttpServletResponse response, Model model, HttpServletRequest request) {

        Cookie cookie = new Cookie("lastVisit", "hwan");
        cookie.setMaxAge(60*60);
        response.addCookie(cookie);

        Cookie cookie2 = new Cookie("userId", "lee");
        cookie2.setMaxAge(60*60);
        response.addCookie(cookie2);

        model.addAttribute("lastVisit", lastVisit);

        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            System.out.print(c.getName() + " ::: ");
            System.out.println(c.getValue());
        }
        return "visit";
    }
}
