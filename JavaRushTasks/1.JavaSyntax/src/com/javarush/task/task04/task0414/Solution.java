package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import sun.security.krb5.SCDynamicStoreConfig;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age%100==0 && age%400==0 || age%4==0 && age%100!=0){
            System.out.println("количество дней в году: 366");
        }else {
            System.out.println("количество дней в году: 365");
        }
    }
}