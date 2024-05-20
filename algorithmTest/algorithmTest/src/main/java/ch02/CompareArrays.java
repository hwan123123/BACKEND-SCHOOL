package ch02;

public class CompareArrays {
    public static boolean areArraysEqual(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // 테스트를 위한 두 배열 선언
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};

        // areArraysEqual 메소드를 사용하여 배열 비교
        System.out.println("array1과 array2는 동일한가? " + areArraysEqual(array1, array2));
        System.out.println("array1과 array3는 동일한가? " + areArraysEqual(array1, array3));
    }
}
