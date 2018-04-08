package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count < 0){
            System.out.println(count+1);
        }
        else  if (count ==0){
            System.out.println(0);
        }
        else {
            System.out.println(count*2);
        }

    }

}