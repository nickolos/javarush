package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int summa_positive_count =0;
            int summa_negative_count =0;
            for (int i = 0; i <3 ; i++) {
                int t = scanner.nextInt();
                summa_positive_count += positive_count(t);
                summa_negative_count += positive_count(-t);
            }
            System.out.println("количество отрицательных чисел: "+summa_negative_count);
        System.out.println("количество положительных чисел: "+summa_positive_count);

        }
        public static int positive_count(int count){
            if (count>0){
                return 1;
            }
            return 0;
        }

}
