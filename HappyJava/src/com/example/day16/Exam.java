package com.example.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Exam {
    public static void main(String[] args) {
        //문제 1. 문자열 리스트 정렬하기
        List<String> list = Arrays.asList("apple", "benz", "cherry");
        Collections.sort(list, (a, b) -> a.length() - b.length());
        System.out.println(list);

        //문제 2. 최대값 찾기
        int[] numbers = {4, 1, 7, 3, 9, 6, 2, 5};
        Arrays.sort(numbers);
        int maxNum = numbers[numbers.length - 1];
        System.out.println(maxNum);

        //문제 3. 리스트의 각 요소에 연산 적용하기
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> result1 = new ArrayList<>();

        list1.forEach(num -> result1.add(num + 10));
        System.out.println(result1);

        //문제 4. 조건에 맞는 요소 찾기
        List<String> list2 = Arrays.asList("appointment", "binary search", "cherry blossom", "development", "environment");

        String result2 = null;
        for (String str : list2) {
            if (str.length() >= 5) {
                result2 = str;
                break;
            }
        }
        System.out.println(result2);

        //문제 5. 요소 변환하기
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> result3 = new ArrayList<>();

        list3.forEach(num -> result3.add(num * num));
        System.out.println(result3);

        //문제 6. 모든 요소에 대해 조건 확인하기
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        for (int num : list4) {
            System.out.print(isEven.test(num) + " ");
        }
    }
}
