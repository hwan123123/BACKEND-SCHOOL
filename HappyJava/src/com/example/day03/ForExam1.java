package com.example.day03;

public class ForExam1 {
    public static void main(String[] args){
        int total = 0;
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);

        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for(int a = 0; a <= 100; a+=2) {
            System.out.println(a);
        }
    }
}

// 1-100 까지의 짝수의 합을 출력해주세요.

// 1-100까지 출력

// 짝수만 출력