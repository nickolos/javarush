package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();

        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Stallone", "rjgrgerg");
        map.put("Stallone1", "bnjfkgn");
        map.put("Stallone2", "djghdfhnfjk");
        map.put("Stallone", "rjgrgerg");
        map.put("Stallone4", "djghdfhnfjk");
        map.put("Stallone5", "bnjfkgn");
        map.put("Stallone2", "thfgjhj");
        map.put("Stallone7", "fjdjjghjy");
        map.put("Stallone8", "dukuykfuil");
        map.put("Stallone7", "ghjkkjhjhll");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
