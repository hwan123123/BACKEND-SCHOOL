package com.example.day03;

import java.util.Scanner;

public class Gugudan1 {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("단을 입력하세요.");
//        int dan = keyboard.nextInt();
//
//        for(int i = 1; i <= 9; i++) {
//            System.out.println(dan + " * " + i + " = " + (dan * i));
//        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("원하는 숫자까지의 짝수의 합을 계산해드리겠습니다.");
        System.out.println("원하시는 숫자를 입력해주세요.");

        int num = keyboard.nextInt();
        int a = 0;
        int total = 0;

        while (a <= num) {
            if (a % 2 == 0) {
                total = total + a;
            }
            a++;
        }
        System.out.println(total);

    }
}
