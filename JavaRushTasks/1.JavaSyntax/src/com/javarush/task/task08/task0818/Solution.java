package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>(  );
        map.put("Stallone", 10000);
        map.put("Stallone1", 20000);
        map.put("Stallone2", 43545643);
        map.put("Stallone3", 56765756);
        map.put("Stallone4", 54);
        map.put("Stallone5", 557);
        map.put("Stallone6", 23);
        map.put("Stallone7", 5345);
        map.put("Stallone8",432);
        map.put("Stallone9", 33);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove( pair.getKey() );

            }

        }
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
//    }
    }
    public static void main(String[] args) {
    removeItemFromMap( createMap() );
    }
}