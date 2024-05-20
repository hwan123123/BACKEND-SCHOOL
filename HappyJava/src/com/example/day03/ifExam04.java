package com.example.day03;

import java.util.Scanner;

public class ifExam04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("체급 확인을 위해 몸무게를 입력해주세요.");

        Double weight = sc.nextDouble();

        if (weight <= 50.80) {
            System.out.println("플라이급입니다.");
        } else if (weight <= 61.23) {
            System.out.println("라이트급입니다.");
        } else if (weight <= 72.57) {
            System.out.println("미들급입니다.");
        } else if (weight <= 88.45) {
            System.out.println("크루저급입니다.");
        } else {
            System.out.println("헤비급입니다.");
        }
    }
}
