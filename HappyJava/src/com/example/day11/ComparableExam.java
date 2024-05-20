package com.example.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Lee");
        list.add("Kim");
        list.add("Park");
        list.add("Seo");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
