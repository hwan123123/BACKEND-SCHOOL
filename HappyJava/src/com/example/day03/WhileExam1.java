package com.example.day03;

public class WhileExam1 {
    public static void main(String[] args) {
        int num =1;

        while(true) {
            if(num == 100)
                break;
            System.out.println(num++);
        }
    }
}
