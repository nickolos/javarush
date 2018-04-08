package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
        BufferedWriter writer= new BufferedWriter( new FileWriter( reader.readLine() ) );
        String string =reader.readLine();
        while (!string.equals( "exit" )){
            writer.write( string + '\n' );
            string = reader.readLine();
        }
        writer.write( string );

        reader.close();
        writer.close();

    }
}
