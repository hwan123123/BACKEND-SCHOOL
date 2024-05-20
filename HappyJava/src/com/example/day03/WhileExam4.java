package com.example.day03;

public class WhileExam4 {
    public static void main(String[] args){
        int i = 0;
        int result = 0;

        while(i <= 100) {
            if (i % 2 == 0) {
                result += i;
            }
            i++;
        }
        System.out.println(result);

        System.out.println("=============================");

        int num = 0;
        int total = 0;

        while(num <= 100) {
            if(num % 2 == 1) {
                total += num;
            }
            num++;
        }
        System.out.println(total);
    }
}