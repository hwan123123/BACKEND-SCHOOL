package ch05;

import java.util.Scanner;

public class SelectionSort {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void sort(int[] arr, int n) {
        for (int i = 0; i < n -1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            swap(arr, i, smallest);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("원소 수 : ");
        int count = input.nextInt();
        int[] elements = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("elements[" + i + "] : ");
            elements[i] = input.nextInt();
        }

        sort(elements, count);

        System.out.println("정렬된 배열(오름차순) : ");
        for (int i = 0; i < count; i++) {
            System.out.println("elements[" + i + "] = " + elements[i]);
        }
    }
}
