package com.example.day11;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        set.add("a");
        System.out.println(set);

        if (set.contains("h")) {
            System.out.println("true");
        }

        Set<Pen> penSet = new HashSet<>();
        penSet.add(new Pen("red"));
        penSet.add(new Pen("black"));
        penSet.add(new Pen("blue"));

        System.out.println(penSet);
        penSet.add(new Pen("red"));
        System.out.println(penSet);
    }
}
