package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) {

        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);
        Date currentTime = new Date(date);
        yearStartTime.setYear(currentTime.getYear());
        currentTime.setHours(0);
        currentTime.setMinutes(0);
        currentTime.setSeconds(0);
  //      System.out.println(currentTime);
        long getTime = Math.abs (currentTime.getTime() - yearStartTime.getTime());
//        System.out.println(getTime);
//        System.out.println(currentTime.getTime());
//        System.out.println(yearStartTime.getTime());
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (getTime/msDay);

      //  System.out.println(dayCount);
        if (dayCount % 2 != 0) {
            return true;
        } else return false;

    }
}
