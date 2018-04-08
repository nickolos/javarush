package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt( reader.readLine() );
        int M = Integer.parseInt( reader.readLine() );
        ArrayList<String> mas = new ArrayList<>(  );

        for (int i = 0; i < N; i++) {
            mas.add( reader.readLine() );
        }

        for (int i = 0; i <M ; i++) {

            mas.add( mas.size(), mas.get( 0 ) );
            mas.remove( 0 );
        }

        for (int i = 0; i < mas.size(); i++) {
            System.out.println(mas.get( i ));
        }
        //напишите тут ваш код
    }
}
