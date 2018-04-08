package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> mas = new ArrayList<>();
        mas.add("[frf");
        mas.add("[frftgr");
        mas.add("[frrghf");
        mas.add("[fregef");
        mas.add("[frtrrwf");
        System.out.println(mas.size());
        for (int i = 0; i <mas.size() ; i++) {
            System.out.println(mas.get(i));
        }
     }
}
