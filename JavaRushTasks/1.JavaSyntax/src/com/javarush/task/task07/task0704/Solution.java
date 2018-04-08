package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int [] mas = new int[10];
        for (int i = 0; i <mas.length ; i++) {
            mas[i]= Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <mas.length ; i++) {
            System.out.println( mas[mas.length - i-1]);
        }
    }
}

