package com.example.day03;

import java.util.Scanner;

public class ifExam06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 영어 대문자로 입력하세요.");
        String test = sc.next();

        if (test.equals("A")) {
            System.out.println("매우잘함");
        } else if (test.equals("B")) {
            System.out.println("잘함");
        } else if (test.equals("C")) {
            System.out.println("보통임");
        } else if (test.equals("D")) {
            System.out.println("노력요함");
        } else if (test.equals("F")) {
            System.out.println("낙제");
        } else {
            System.out.println("잘못입력");
        }
    }
}
