package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> mas = new ArrayList<>( );

        for (int i = 0; i <10 ; i++) {
            mas.add( Integer.parseInt( reader.readLine() ) );
        }
        for (int i = 0; i < mas.size(); i++) {
            System.out.println(mas .get( mas.size()-1- i ));
        }
        //напишите тут ваш код
    }
}
