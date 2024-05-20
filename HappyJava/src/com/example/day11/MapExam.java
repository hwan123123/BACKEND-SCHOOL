package com.example.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(111, "Lee");
        map.put(222, "Kim");
        map.put(333, "Park");

        System.out.println(map);

        System.out.println(map.get(111));

        Set<Integer> keyset = map.keySet();
        Iterator<Integer> keyIter = keyset.iterator();
        while (keyIter.hasNext()) {
            Integer key = keyIter.next();
            System.out.print("key : " + key);
            System.out.println("  |  value : " + map.get(key));
        }

        for (Integer key : keyset) {
            System.out.print("key : " + key);
            System.out.println("  |  value : " + map.get(key));
        }
    }
}
