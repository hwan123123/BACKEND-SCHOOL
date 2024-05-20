package ch02;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copied = original.clone();

        copied[2] = 0;

        System.out.println("original = " + Arrays.toString(original));
        System.out.println("copied = " + Arrays.toString(copied));
    }
}
