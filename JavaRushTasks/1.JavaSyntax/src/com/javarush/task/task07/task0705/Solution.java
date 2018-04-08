package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int [] mas = new int[20];
        int [] mas1 = new int[10];
        int [] mas2 = new int[10];
        for (int i = 0; i <mas.length ; i++) {
            mas[i]= Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <mas.length- mas.length/2 ; i++) {
            mas1[i]=mas[i];
        }

        for (int i = 0; i <mas2.length ; i++) {
            mas2[i]=mas[mas.length-mas.length/2+i];
        }
        for (int i = 0; i <mas2.length ; i++) {
            System.out.println(mas2[i]);
        }

    }
    }

