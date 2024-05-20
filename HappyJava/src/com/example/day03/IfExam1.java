package com.example.day03;

public class IfExam1 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        if(a > b) {
            System.out.println("a는 b보다 큽니다.");
        } else {
            System.out.println("b는 a보다 큽니다.");
        }

        //a가 짝수입니다. 라고 출력되도록 if문을 만들어주세요.
        //a % 2 == 0

        if(b % 2 == 0) {
            System.out.println("b는 짝수입니다.");
        } else {
            System.out.println("b는 홀수입니다.");
        }
    }
}
