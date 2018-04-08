package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double summa = 0.0;
        int count_in=0;
        int t = scanner.nextInt();
        while (t!=-1){
            summa+=t;
            count_in++;
            t=scanner.nextInt();
        }
        System.out.println(summa/count_in);
    }
}

