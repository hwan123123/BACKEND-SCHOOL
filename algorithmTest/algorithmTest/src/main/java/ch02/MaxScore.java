package ch02;

import java.util.Scanner;

public class MaxScore {
    static int maxOf(int[] score) {
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력해주세요 : ");
        int student = sc.nextInt();

        int[] score = new int[student];

        for (int i = 0; i < student; i++) {
            System.out.println((i+1) + "번째 학생의 점수를 입력하세요 : ");
            score[i] = sc.nextInt();
        }

        System.out.println("가장 높은 점수는 " + maxOf(score) + "점 입니다.");
    }
}
