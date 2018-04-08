package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int countMin = 1000000;
        int countMax = -7;
        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
            if (strings.get(i).length() < countMin) {
                countMin = strings.get(i).length();
            }
            else if (strings.get(i).length() > countMax) {
                countMax = strings.get(i).length();
            }
        }
        if (index((strings),countMin)<index((strings),countMax)){
            for (int i = 0; i <strings.size() ; i++) {
                if (strings.get(i).length()==countMin){
                    System.out.println(strings.get(i));
                    break;
                }
            }
        }
        else {
            for (int i = 0; i <strings.size() ; i++) {
                if (strings.get(i).length()==countMax){
                    System.out.println(strings.get(i));
                   break;
                }
            }
        }

    }

    public static int index (ArrayList<String> mas, int count){
        for (int i = 0; i <mas.size() ; i++) {
            if (mas.get(i).length()==count){
                return i;
            }
        }
        return 0;
    }
}
