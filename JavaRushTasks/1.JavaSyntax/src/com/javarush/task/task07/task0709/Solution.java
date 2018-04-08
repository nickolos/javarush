package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings=new ArrayList<>() ;

        Scanner scanner = new Scanner(System.in);
        strings.add(scanner.nextLine());
        int count = strings.get(0).length();

        for (int i = 1; i < 5; i++) {
            strings.add(scanner.nextLine());
            if (strings.get(i).length() < count) {
                count = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == count) {
                System.out.println(strings.get(i));
            }
        }
    }
}
