package org.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.*;

@Controller
public class DateTimeController {
    @GetMapping("/datetime")
    public String showDateTime(Model model) {
        // 날짜 및 시간 데이터
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime time = LocalTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        // 모델에 데이터 추가
        model.addAttribute("currentDate", date);
        model.addAttribute("currentDateTime", dateTime);
        model.addAttribute("currentTime", time);
        model.addAttribute("currentZonedDateTime", zonedDateTime);

        return "datetime";
    }
}
