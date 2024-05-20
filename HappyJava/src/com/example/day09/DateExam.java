package com.example.day09;

import java.util.Calendar;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date now = new Date(2020,1,1);
        System.out.println(now);

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

        calendar.set(Calendar.MONTH, 1);

        System.out.println(calendar.getActualMaximum(Calendar.DATE));

        //년 월을 입력 받아서 해당 년, 월의 달력을 출력해 보세요.
    }
}
