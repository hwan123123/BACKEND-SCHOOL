package ch03;

import java.util.Arrays;

public class SearchExam {
//    static int sequentialSerach(int[] array, int key) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == key) {
//                return i;
//            }
//        } return -1;
//    }
    static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        Arrays.sort(array);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] iarr = {1, 3, 5, 33, 56, 2, 44};

        int index = binarySearch(iarr, 2);

        System.out.println(index);

//        if(index != -1) {
//            System.out.println("당신이 찾는 데이터는 " + index + "번째 인덱스에 있습니다.");
//        } else {
//            System.out.println("당신이 찾는 데이터는 존재하지 않습니다.");
//        }
    }
}
