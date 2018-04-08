package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner( System.in );
        ArrayList<Integer> masall = new ArrayList<>();
        ArrayList<Integer> masofmod2 = new ArrayList<>();
        ArrayList<Integer> masofmod3 = new ArrayList<>();
        ArrayList<Integer> masofall = new ArrayList<>();


        for (int i = 0; i <20 ; i++) {
            masall.add(scanner.nextInt());

        }
        for (int i = 0; i <masall.size() ; i++) {

            if (masall.get( i )%3==0) masofmod2.add(masall.get( i ));

            if (masall.get( i )%2==0) masofmod3.add( masall.get( i ));

            if (masall.get( i )%2!=0 &&  masall.get( i )%3!=0)  masofall.add( masall.get( i ));
        }
        printList( masofmod3 );
        printList( masofmod2 );
        printList( masofall );
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get( i ));
        }
    }
}
