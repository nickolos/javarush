package com.javarush.task.task06.task0622;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.util.Arrays.*;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] masCount = new int[5];

        for (int i = 0; i < 5; i++) {
            masCount[i] = Integer.parseInt(reader.readLine());

        }
        Arrays.sort(masCount);
        for (int i = 0; i < masCount.length; i++) {

            System.out.println(masCount[i]);
        }
    }
}
