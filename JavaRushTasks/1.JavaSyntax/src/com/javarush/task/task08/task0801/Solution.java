package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {

        HashSet<String> fruit = new HashSet<>();

       fruit.add("арбуз");
        fruit.add("банан");
        fruit.add("вишня");
        fruit.add("груша");
        fruit.add("дыня");
        fruit.add("ежевика");
        fruit.add("жень-шень");
        fruit.add("земляника");
        fruit.add("ирис");
        fruit.add("картофель");

        for ( String  s: fruit ) {
            System.out.println(s);
        }

    }
}
