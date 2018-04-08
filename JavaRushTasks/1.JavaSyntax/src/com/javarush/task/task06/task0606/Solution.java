package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );
        String count = scanner.next();

        for (int i = 0; i <count.length() ; i++) {

            if (Integer.parseInt( String.valueOf(count.charAt( i ))) %2==0){
                even++;
            }
            else {
                odd++;
            }

        }

        System.out.println("Even: "+ even+ " Odd: "+odd);
    }
}
