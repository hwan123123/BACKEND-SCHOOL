package com.example.day10;

import com.example.day01.Book;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test");
        list.add(10);
        list.add(new Book());

        System.out.println(list);
        String strValue = (String) list.get(0);
        Integer i = (Integer)list.get(1);
        System.out.println(i);
        int value = (Integer)list.get(1);

        List<String> strList = new ArrayList<>();
        strList.add("abc");
//        strList.add(10);
//        strList.add(new Book());

        String sValue = strList.get(0);
    }
}
