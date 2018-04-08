package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String time =scanner.nextLine();

        HashMap<String,Integer> month = new HashMap<>();

        month.put("January",1);
        month.put("February",2);
        month.put("March",3);
        month.put("April",4);
        month.put("May",5);
        month.put("June",6);
        month.put("July",7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);

        for (Map.Entry<String, Integer> pair : month.entrySet()) {
            if (pair.getKey().equals(time)){
                System.out.println(pair.getKey()+" is "+pair.getValue()+" month");
            }

        }
    }
}
