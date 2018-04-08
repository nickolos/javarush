package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy",  Locale.ENGLISH );
        Scanner scanner = new Scanner( System.in );
        Date date = new Date(scanner.nextLine());
        System.out.println(dateFormat.format(date).toUpperCase());

    }
}
