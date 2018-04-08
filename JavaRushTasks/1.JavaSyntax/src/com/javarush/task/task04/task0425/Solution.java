package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int ox = scanner.nextInt();
        int oy = scanner.nextInt();

        if (ox >0 && oy> 0 ){
            System.out.println(1);
        }
        else if (ox <0 && oy >0  ){
            System.out.println(2);
        }
        else if (ox<0 && oy <0 ){
            System.out.println(3);
        }
        else {
            System.out.println(4);
        }
    }
}

