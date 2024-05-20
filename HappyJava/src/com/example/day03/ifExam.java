package com.example.day03;

import java.util.Scanner;

public class ifExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력해주세요.");

        int age = sc.nextInt();
        int num = 20;

        if(age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("당신은 " + (num - age) + "년 후에 성인이 됩니다.");
        }
    }
}
