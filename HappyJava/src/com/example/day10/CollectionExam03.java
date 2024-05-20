package com.example.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExam03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        // 점수 입력 받기
        readScores(input, scores);

        // 0점 제거
        removeZero(scores);

        // 결과 출력
        printScores(scores);

        // 리소스 정리
        input.close();
    }

    public static void readScores(Scanner input, List<Integer> scores) {
        while (true) {
            System.out.println("점수를 입력하세요.");
            int score = input.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("0-100사이의 숫자만 입력이 가능합니다.");
                continue;
            } else if (score == 0) {
                break;
            }
            scores.add(score);
        }
    }

    public static void removeZero(List<Integer> scores) {
        scores.remove(Integer.valueOf(0));
    }

    public static void printScores(List<Integer> scores) {
        System.out.println("점수 : " + scores);

        int sum = 0;
        for (Integer score : scores) {
            sum += score;
        }

        System.out.println("합계 : " + sum);

        if (!scores.isEmpty()) {
            int average = sum / scores.size();
            System.out.println("평균 : " + average);
        } else {
            System.out.println("점수가 입력되지 않았습니다.");
        }
    }
}
