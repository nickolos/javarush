package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
        FileInputStream inStream = new FileInputStream(reader.readLine());
        BufferedReader reader1 = new BufferedReader(new InputStreamReader( inStream ));
        ArrayList<Integer> mas = new ArrayList<>(  );
        String line = reader1.readLine();
        while (line!=null){
           int data =  Integer.parseInt( line );
            if (data%2==0){
                mas.add( data );
            }
            line =reader1.readLine();
        }
        reader1.close();
        inStream.close();
        Collections.sort( mas );
        for (int i: mas ) {
            System.out.println( i);
        }

    }
}
