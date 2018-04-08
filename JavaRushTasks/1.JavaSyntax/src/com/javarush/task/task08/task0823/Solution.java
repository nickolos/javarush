package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String [] s1 = s.trim().replace("  ","").split(" ");
        //System.out.println(Arrays.toString(s1));
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            str.append(Character.toUpperCase(s1[i].charAt(0))).append(s1[i].substring(1,s1[i].length()));
            str.append(" ");
        }
        //напишите тут ваш код
        System.out.println(str .toString());
    }
}
