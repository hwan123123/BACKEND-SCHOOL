package ch05;

import java.util.Scanner;

public class GCDCalculator {
    static int calculateGCD(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return calculateGCD(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 수의 최대공약수를 계산합니다.");

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int y = stdIn.nextInt();

        System.out.println("두 수의 최대공약수는 " + calculateGCD(x, y) + "입니다.");
    }
}
