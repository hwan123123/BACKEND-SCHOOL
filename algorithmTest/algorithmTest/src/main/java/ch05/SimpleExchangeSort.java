package ch05;

import java.util.Scanner;

public class SimpleExchangeSort {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > 1; j--) {
                if (a[j-1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순 정렬 완료");

        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
