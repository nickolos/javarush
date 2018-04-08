package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner( System.in );
        ArrayList<String> masall = new ArrayList<>(5);
        for (int i = 0; i <5 ; i++) {
            masall.add(scanner.nextLine());
        }
        masall.remove( 2 );
        for (int i = 0; i < masall.size(); i++) {
            System.out.println(masall.get( masall.size()-1-i ));
        }

    }
}


