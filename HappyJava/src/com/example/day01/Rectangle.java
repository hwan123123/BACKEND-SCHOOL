package com.example.day01;

public class Rectangle {
    public static void main(String[] args) {
        int i = 1;  //지역변수

        while(i <= 5) {    //while(조건){ 문장 }
            int j = 1;

            while(j <= i) {
                System.out.print("*");
                j = j + 1;
            }

            System.out.println();
            i = i + 1;
        }
    }
}