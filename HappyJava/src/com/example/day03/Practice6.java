package com.example.day03;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        do {
            System.out.println("숫자 입력 : ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("합은 " + sum + "입니다.");
    }
}
