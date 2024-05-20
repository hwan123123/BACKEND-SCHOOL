package ch01;

import java.util.Scanner;

public class Multi99Table {
    public static void main(String[] args) {

        System.out.println("========== 구구단 출력 ==========");

        Scanner sc = new Scanner(System.in);

        System.out.println("가로 단을 정해주세요.");
        int width = sc.nextInt();
        sc.nextLine();
        System.out.println("세로 단을 정해주세요.");
        int length = sc.nextInt();

        for (int i = 1 ; i <= length; i++) {
            for (int j = 1 ; j <= width; j++)
                System.out.printf("%5d", i * j);
            System.out.println();
        }
    }
}
