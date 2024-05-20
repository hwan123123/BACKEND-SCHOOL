package com.example.day04;

public class Array09 {
    public static void main(String[] args) {
        int[][] array = {{0,1,2}, {3,4,5}};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] koreanScoreArray = new int[3][];
        koreanScoreArray[0] = new int[20];
        koreanScoreArray[0] = new int[19];
        koreanScoreArray[0] = new int[21];

        System.out.println(koreanScoreArray[0].length);
    }
}
