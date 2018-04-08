package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JULY 1 1980"));
        map.put("Stallone2", new Date("OCTOBER 1 1980"));
        map.put("Stallone3", new Date("APRIL 1 1980"));
        map.put("Stallone4", new Date("MARCH 1 1980"));
        map.put("Stallone5", new Date("MAY 1 1980"));
        map.put("Stallone6", new Date("DECEMBER 1 1980"));
        map.put("Stallone7", new Date("AUGUST 1 1980"));
        map.put("Stallone8", new Date("JANUARY 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        HashMap<String,Date> mapCopy = new HashMap<>(map);
        for(HashMap.Entry<String, Date> pair : mapCopy.entrySet()) {
            if (pair.getValue().toString().contains ("Jun") || pair.getValue().toString().contains("Jul") ||
                    pair.getValue().toString().contains("Aug")) {
                map.remove(pair.getKey(),pair.getValue());


            }

        }
           }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
