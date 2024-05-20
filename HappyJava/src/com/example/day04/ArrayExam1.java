package com.example.day04;

import java.util.Scanner;

public class ArrayExam1 {
    public static void main(String args[]) {
        // 배열의 선언
        int[] iarr;

        int iarr2[];

        // 배열의 생성
        iarr = new int[3];
        iarr2 = new int[5];

        // 배열의 이용
        iarr[0] = 10;
        iarr[1] = 20;

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("값을 입력하시오.");
//        iarr[0] = sc.nextInt();

        int i = iarr[0];

        System.out.println(i);
        System.out.println(iarr[0]);

//        iarr[3] = 40;

        System.out.println(iarr[2]);

        int[] array1, array2;

        int array3[], array4;

        array2 = new int[2];
        array4 = 10;

        int[] iia = new int[4];

        iia[0] = 10;

        int[] arr2 = new int[]{10,20,30};
        int[] arr3 = {10,20,30,40};

        System.out.println(arr2[2]);
        System.out.println(arr3[3]);
        System.out.println("==================");

        // 반복문의 사용
        for(int ii = 0; ii < 4; ii++) {
            iia[ii] = ii+1;
        }

        for(int j = 0; j < 4; j++) {
            System.out.println(iia[j]);
        }
    }
}
