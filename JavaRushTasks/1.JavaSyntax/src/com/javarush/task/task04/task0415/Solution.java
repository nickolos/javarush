package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a<0 || b<0 || c<0){
            System.out.println("Треугольник не существует.");
        }
        else if (b+c>a && c+a>b && a+b>c){
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }
    }
}