package ch05;

import java.util.Scanner;

class RecursiveExploration {
    //--- 숫자 n을 사용하여 순수 재귀 패턴을 생성하고 출력하는 메서드 ---//
    static void displayPattern(int n) {
        if (n > 0) {
            displayPattern(n - 1); // 첫 번째 재귀 호출
            System.out.println("Number: " + n);
            displayPattern(n - 2); // 두 번째 재귀 호출
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

//        System.out.print("출력할 숫자를 입력하세요: ");
//        int x = stdIn.nextInt();

        displayPattern(1);
        System.out.println("==========");
        displayPattern(2);
        System.out.println("==========");
        displayPattern(3);
        System.out.println("==========");
        displayPattern(4);
        System.out.println("==========");
        displayPattern(5);
        System.out.println("==========");
    }
}