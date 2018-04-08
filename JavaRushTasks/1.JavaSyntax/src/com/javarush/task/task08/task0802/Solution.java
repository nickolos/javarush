package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String,String> fruit = new HashMap<>();

        fruit.put("арбуз","ягода");
        fruit.put("банан", "трава");
        fruit.put("вишня", "ягода");
        fruit.put("груша", "фрукт");
        fruit.put("дыня", "овощ");
        fruit.put("ежевика", "куст");
        fruit.put("жень-шень", "корень");
        fruit.put("земляника", "ягода");
        fruit.put("ирис", "цветок");
        fruit.put("картофель", "клубень");

        for (Map.Entry<String, String>  s:fruit.entrySet() ) {
            System.out.println(s.getKey()+ " - "+ s.getValue());
        }


    }
}
