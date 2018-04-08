package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String [] mas = new String[10];
        int [] mas1 = new int[10];
        for (int i = 0; i <mas.length ; i++) {
            mas[i]= scanner.nextLine();
        }
        for (int i = 0; i <mas1.length ; i++) {
            mas1[i]=mas[i].length();
        }
        for (int i = 0; i <mas1.length ; i++) {
            System.out.println(mas1[i]);
        }
    }
}
