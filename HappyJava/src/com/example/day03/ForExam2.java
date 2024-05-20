package com.example.day03;

public class ForExam2 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int num = 0;

        for(int a = 1; a < 10; a++) {
            for(int b = 1; b < 10; b++) {
                num = a * b;
                System.out.println(a + "*" + b + " = " + num);
            }
        }
    }
}
