package com.example.day03;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("숫자를 입력해주시면 해당 숫자까지의 곱을 계산하겠습니다.");

        int num = Keyboard.nextInt();
        int result = 1;

        for(int a = 1; a <= num; a++) {
            result = result * a;
        }
        System.out.println(num + "까지의 곱은" + result + "입니다.");
    }
}
