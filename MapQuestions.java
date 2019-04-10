package com.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapQuestions {
    public static void main(String[] args) {
        Map<String, String> fruits = new HashMap() {{
            put("3", "APPLE");
            put("1", "ORANGE");
            put("2", "BANANA");
        }};

//        fruitsInTreeMap.putAll(fruits);
//        fruitsInTreeMap.forEach((K,V) -> {System.out.println(K);});

//        Map<String, String> fruitsInTreeMapReverse = new TreeMap<>(fruits);
//
//
//        NavigableSet<String> set1 = ((TreeMap<String, String>) fruitsInTreeMapReverse).descendingKeySet();
//
//        NavigableMap<String, String> navigableMap = ((TreeMap<String, String>) fruitsInTreeMapReverse).descendingMap();
//
//        Map<String, String> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.rem

        NavigableMap<Integer, String> nav = new TreeMap<>();
        nav.put(1, "a");
        nav.put(2, "b");
        nav.put(3, "c");
        nav.put(4, "d");
        nav.put(5, "e");
        nav.put(6, "f");

        Map.Entry<Integer, String> ent = nav.ceilingEntry(2);
        Map.Entry<Integer, String> ent1 = nav.floorEntry(2);
        Map.Entry<Integer, String> ent2 = nav.higherEntry(2);
        Map.Entry<Integer, String> ent3 = nav.lowerEntry(2);
        System.out.println(ent.getKey());
        System.out.println(ent1.getKey());
        System.out.println(ent2.getKey());
        System.out.println(ent3.getKey());

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(1);
        navigableSet.add(2);
        navigableSet.add(3);
        navigableSet.add(4);
        navigableSet.add(5);
        





    }
}
