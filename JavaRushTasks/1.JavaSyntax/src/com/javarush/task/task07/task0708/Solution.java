package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings=new ArrayList<String>() {
    };

    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        strings.add(scanner.nextLine());
        int count =strings.get(0).length();

        for (int i = 1; i < 5; i++) {
            strings.add(scanner.nextLine());
            if (strings.get(i).length() > count){
                count=strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length()==count){
                System.out.println(strings.get(i));
            }
        }


    }
}
