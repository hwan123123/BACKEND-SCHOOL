package com.example.day03;

import java.util.Scanner;

public class SWExam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("0 ~ 4.5 이하의 평점을 입력하시오.");
        double a = sc.nextDouble();

        switch ((int) a) {
            case 4:
                System.out.println("장학금을 받아가세요.");
                break;
            case 3:
                System.out.println("다음 학기를 준비하세요.");
                break;
            case 2:
                System.out.println("계절 학기에 등록하세요.");
                break;
            default:
                System.out.println("다음 학기에 재수강하세요.");
        }
    }
}
