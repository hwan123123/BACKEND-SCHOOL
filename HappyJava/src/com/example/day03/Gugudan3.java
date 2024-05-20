package com.example.day03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("구구단 중 출력할 단을 입력하세요: ");
            int dan = scanner.nextInt();

            if (dan < 1 || dan > 9) {
                throw new IllegalArgumentException("1부터 9까지의 숫자를 입력하세요.");
            }

            System.out.println(dan + "단을 출력합니다.");

            for (int i = 1; i <= 9; i++) {
                int result = dan * i;
                System.out.println(dan + " x " + i + " = " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
