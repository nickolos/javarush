package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>(  );
        map.put("Stallone", "rjgrgerg");
        map.put("Stallone1", "bnjfkgn");
        map.put("Stallone2", "djghdfhnfjk");
        map.put("Stallone3", "rjgrgerg");
        map.put("Stallone4", "djghdfhnfjk");
        map.put("Stallone5", "bnjfkgn");
        map.put("Stallone6", "thfgjhj");
        map.put("Stallone7", "fjdjjghjy");
        map.put("Stallone8", "dukuykfuil");
        map.put("Stallone9", "ghjkkjhjhll");
    return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код

        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String,String> pair:copy.entrySet())
        {
            for (Map.Entry<String,String> pair2:copy.entrySet())
            {
                if(pair.getValue().equals(pair2.getValue()) && !pair.getKey().equals(pair2.getKey()))
                {removeItemFromMapByValue(map,pair.getValue());
                    break;}
            }
        }

//        for ( Map.Entry<String, String> pair : map.entrySet()) {
//            System.out.println(pair);
//        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
