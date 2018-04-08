package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        int mouth =  date.getMonth()+1;
        int year = date.getYear()+1900;
        System.out.println(date.getDate()+ " " + mouth+" "+year);
    }
}
