package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int [] mas = new int[15];
        int sum0=0;
        int sum1=0;
        for (int i = 0; i <mas.length ; i++) {
            mas[i]= Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <mas.length ; i++) {
            if (i%2==0){
                sum0+=mas[i];
            }
            else {
                sum1+=mas[i];
            }
        }

        if (sum0>sum1){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
