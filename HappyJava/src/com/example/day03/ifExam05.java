package com.example.day03;

import java.util.Scanner;

public class ifExam05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 값을 입력해주세요.");
        Double num = sc.nextDouble();

        System.out.println("두 번째 값을 입력해주세요.");
        Double num1 = sc.nextDouble();

        if(num >= 4.0 && num1 >= 4.0) {
            System.out.println("A");
        } else if(num >= 3.0 && num >= 3.0) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
