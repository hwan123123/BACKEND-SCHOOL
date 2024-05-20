package ch01;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이등변 삼각형의 높이를 입력하세요 : ");
        int size = sc.nextInt();

        draw(size);
    }

    static void draw(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
