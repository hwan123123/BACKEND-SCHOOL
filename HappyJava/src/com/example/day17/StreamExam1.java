package com.example.day17;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamExam1 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("aesf", "bee", "acer", "aered", "edas");

        List<String> filteredList = myList.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(filteredList);

        //스트림 쓰지 않고 코드를 만든다면?
        List<String> filteredList1 = new ArrayList<>();
        for (String str : myList) {
            if (str.startsWith("a")) {
                filteredList1.add(str);
            }
        }
        System.out.println(filteredList1);

        String[] names = {"lee", "park", "kim", "son", "seo", "ryu"};

        for (String name : names) {
            System.out.println(name);
        }

        Arrays.stream(names).forEach(System.out::println);
        Arrays.stream(names).forEach(name -> System.out.println(name));
        Arrays.stream(names).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        int[] iarr = {1, 2, 3, 4, 5, 6, 7, 8};

        //짝수만 출력!!

        Arrays.stream(iarr).filter(a -> a % 2 == 0).forEach(System.out::println);

        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");

        //글자수가 5 이상인 것만 필터링하고, 중복은 제거해서 새로운 리스트로 얻어온다.
        List<String> word = new ArrayList<>();
        for (String str : words) {
            if (str.length() >= 5) {
                if (!word.contains(str)) {
                    word.add(str);
                }
            }
        }
        System.out.println(word);

        words.stream().map(wordbig -> wordbig.toUpperCase()).forEach(System.out::println);

        int[] intArr = {3, 6, 3, 76, 4, 2};

        //각 요소에 3을 곱해서 출력해주세요.

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i] * 3);
        }

        Arrays.stream(intArr).map(i -> i * 3).forEach(System.out::println);
    }
}
