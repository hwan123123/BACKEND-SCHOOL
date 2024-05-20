package com.example.day04;

public class UnlimitiedArgumentsExam {
    public static void main(String[] args){
        System.out.println(sum(5,15));
        System.out.println(sum(1,9,4,7));
        System.out.println(sum(3,8,1,3,4,3));
    }
    public static int sum(int... args){
        System.out.println("print1 메소드 - args 길이 : " + args.length);
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum += args[i];
        }
        return sum;
    }

}
