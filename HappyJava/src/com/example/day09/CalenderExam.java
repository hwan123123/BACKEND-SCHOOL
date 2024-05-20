package com.example.day09;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderExam {

    public static void printCalender(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, 1);
        int lastOfDate = calendar.getActualMaximum(Calendar.DATE);
        int week = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("\t\t" + calendar.get(Calendar.YEAR) + "년 " + (calendar.get(Calendar.MONTH) + 1) + "월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 1; i < week; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= lastOfDate; i++) {
            System.out.print(i + "\t");
            if (week % 7 == 0) {
                System.out.println();
            }
            week++;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("년도를 입력하세요.");
        int year = keyboard.nextInt();

        System.out.println("월 을 입력하세요.");
        int month = keyboard.nextInt();

        printCalender(year, month);
    }
}
