package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int summa =0;
        for (int i = 0; i <3 ; i++) {
            summa += modul_count(scanner.nextInt());
        }
        System.out.println(summa);

    }
    public static int modul_count(int count){
        if (count>0){
            return 1;
        }
        return 0;
    }
}
