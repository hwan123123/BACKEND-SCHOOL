package ch05;

import java.util.Arrays;
import java.util.Random;

public class SortExam {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) { // 한 번 돌면 마지막 요소 하나가 정렬됨.
                // 인접한 두 요소를 비교해서 앞의 요소가 뒤의 요소보다 큰 값이면 교환
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(i+1+"번째 :: " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[8];

        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println("원래배열 : " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
    }
}
