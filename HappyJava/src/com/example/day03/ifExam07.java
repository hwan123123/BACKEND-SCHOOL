package com.example.day03;

import java.util.Scanner;

public class ifExam07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력해주세요.");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력해주세요.");
        int num2 = sc.nextInt();
        System.out.println("세 번째 정수를 입력해주세요.");
        int num3 = sc.nextInt();

        int min = 0;

        min = Math.min(num1,num2);
        min = Math.min(min,num3);

        System.out.println(min);
    }
}
