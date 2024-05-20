package com.example.day17;

import java.util.Arrays;
import java.util.List;

public class AggregateStreamExam {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList();
        long count = numbers.stream().count(); // 요소 개수
        int max = numbers.stream().max(Integer::compareTo).orElse(0); // 최대 값, List가 비어있으면 0 반환
        int min = numbers.stream().min(Integer::compareTo).orElse(0); // 최소 값
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0); // 평균 값
        int sum = numbers.stream().mapToInt(Integer::intValue).sum(); // 총합
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
        System.out.println(sum);
    }
}
