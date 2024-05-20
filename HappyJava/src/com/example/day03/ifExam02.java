package com.example.day03;

import java.util.Scanner;

public class ifExam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키를 숫자로만 입력해주세요.");
        int height = sc.nextInt();
        System.out.println("몸무게를 숫자로만 입력해주세요.");
        int weight = sc.nextInt();

        int bmi = weight + 100 - height;

        if(bmi > 0) {
            System.out.println("비만수치는 " + bmi + "입니다. 당신은 비만이군요.");
        }
    }
}
