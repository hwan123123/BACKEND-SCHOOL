package ch03;

import java.util.Scanner;

public class LinearSearchSentinel {
    static int LinearSearchSentinel(int[] arr, int size, int key) {
        int i = 0;
        arr[size] = key;

        while (true) {
            if (arr[i] == key)
                break;
            i++;
        }
        return i == size ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 개수 : ");
        int num = stdIn.nextInt();
        int[] array = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.println("array[" + i + "] : ");
            array[i] = stdIn.nextInt();
        }

        System.out.print("찾을 값 : ");
        int key = stdIn.nextInt();

        int index = LinearSearchSentinel(array, num, key);

        if (index == -1)
            System.out.println("찾는 값의 요소가 없습니다.");
        else
            System.out.println("찾는 값은 array[" + index + "]에 있습니다.");
    }
}
