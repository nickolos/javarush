package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.getInteger;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner( System.in );
        int summa = 0;

        String t = scanner.next(  );

        while (!t.equals("сумма")){

            summa +=  Integer.parseInt( t );
            t=scanner.next(  );
        }
        System.out.println(summa);
    }
}