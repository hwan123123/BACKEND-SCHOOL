package com.example.day03;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("화씨 온도로 변환을 희망하는 섭씨 온도를 입력해주세요.");

        Double c = keyboard.nextDouble();
        Double f = c * 9/5 + 32;

        System.out.println("변환된 화씨 온도는 : " + f + "도 입니다.");
    }
}
