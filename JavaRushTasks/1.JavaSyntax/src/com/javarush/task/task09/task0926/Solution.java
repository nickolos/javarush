package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int [] mas = {5,2, 4, 7, 0};
        ArrayList<int[]> list = new ArrayList<>(  );
        for (int i=0; i<mas.length; i++){
            int [] t = new int [mas[i]];
            for (int j = 0; j <mas[i] ; j++) {
                 t[j]=j;
            }
            list.add( t );
        }
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
