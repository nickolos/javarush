package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = (int) Math.floor(scanner.nextDouble());
        if (count ==0 || count%5==1 || count%5==2 || count%5==0){
            System.out.println("зелёный");
        }
        else if (count%5==3){
            System.out.println("жёлтый");
        }
        else if (count%5==4){
            System.out.println("красный");
        }
    }
}