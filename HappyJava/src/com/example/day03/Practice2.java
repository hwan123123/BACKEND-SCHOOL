package com.example.day03;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("숫자를 입력해주시면 홀수 짝수 여부를 확인하겠습니다.");

        int num = Keyboard.nextInt();
        if (num % 2 == 1) {
            System.out.println("해당 숫자는 홀수입니다.");
        } else {
            System.out.println("해당 숫자는 짝수입니다.");
        }
    }
}
