package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner( System.in );
        ArrayList<String> list = new ArrayList<>(10);
        for (int i = 0; i <10 ; i++) {
            list.add(scanner.nextLine());
        }
        int count =0;

        while (count < list.size()-1 && list.get( count ).length()<=list.get( count+1 ).length() ){
            count++;
        }

        if (count==0){
            System.out.println(count);
        }
        else  if (count==9){

        }
        else{
            System.out.println(count+1);
        }
    }
}

