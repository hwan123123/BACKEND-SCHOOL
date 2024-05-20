package ch01;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신이 그리고 싶은 삼각형의 크기(높이)를 입력하세요 : ");
        int size = sc.nextInt();

        draw(size);
    }

    static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
