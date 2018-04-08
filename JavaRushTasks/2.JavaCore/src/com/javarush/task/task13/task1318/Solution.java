package com.javarush.task.task13.task1318;

import javax.print.attribute.standard.Sides;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
        InputStream inStream = new FileInputStream(reader.readLine());
        reader.close();
        String string ="";
        while (inStream.available() > 0){
           int data =inStream.read();
            System.out.print((char)(data));

        }
        System.out.println(string);
        inStream.close();
    }
}