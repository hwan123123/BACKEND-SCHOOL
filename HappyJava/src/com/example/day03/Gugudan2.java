package com.example.day03;

public class Gugudan2 {
    public static void main(String[] args) {
        outter:
        for(int i = 1; i <= 9; i++) {
            for(int k = 1; k <= 9; k++) {
//                System.out.print(i + " * " + k + " = " + (i * k) + "\t");
                // \t = tab / \n  \r

                System.out.printf("%d * %d = %d \t", k, i, k*i);

//                if(k == 5)
//                    break outter;
            }
            if(i == 5)
                break outter;
            System.out.println();
        }
    }
}
