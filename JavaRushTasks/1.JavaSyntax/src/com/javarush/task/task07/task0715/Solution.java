package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> masall = new ArrayList<String>();

        masall.add("мама");
        masall.add("мыла");
        masall.add("раму");

        for (int i = 1; i <6 ; i++) {
            if (i%2==1) masall.add( i,"именно" );
        }
        for (int i = 0; i < masall.size(); i++) {
            System.out.println(masall.get( i ));
        }
    }
}
