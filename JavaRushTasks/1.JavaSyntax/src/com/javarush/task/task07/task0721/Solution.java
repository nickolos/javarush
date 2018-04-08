package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum=-10000000;
        int minimum=10000000;
        int [] mas = new int[20];
        //напишите тут ваш код
        for (int i = 0; i <mas.length ; i++) {
            mas [i]=Integer.parseInt( reader.readLine() );
        }

        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]<minimum){
                minimum=mas[i];
            }
            if (mas[i]>maximum){
                maximum=mas[i];
            }

        }

        System.out.print(maximum + " " + minimum);
    }
}
