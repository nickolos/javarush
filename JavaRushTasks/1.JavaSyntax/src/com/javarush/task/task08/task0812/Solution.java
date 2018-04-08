package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mas = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            mas.add(scanner.nextInt());
        }
        int count =1;
        int count1=1;
        for (int i = 0; i <mas.size()-1 ; i++) {
            if (mas.get(i)==(mas.get(i+1))){
                count++;

            }
            if (count >= count1 && !mas.get(i).equals(mas.get(i+1) )){
                count1 = count;
                count=1;

            }
        }

        if ((count > count1)) {
            System.out.println(count);
        } else {
            System.out.println(count1);
        }


    }
}