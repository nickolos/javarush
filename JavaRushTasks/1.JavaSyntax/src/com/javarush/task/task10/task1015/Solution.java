package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list =new ArrayList[2] ;
        ArrayList<String> string =new ArrayList<>(  );
        string.add( "sdhjf");
        string.add( "dshjfjf jdshgdg");
        string.add("fdgs safjk jskhfdjsd");
        ArrayList<String> string1 =new ArrayList<>(  );
        string1.add("dshjsdfjf jksfh jdshgdg");
        string1.add("fdgs safjk jskhfdjsd");
        string1.add("143jh35hhj");
        string1.add("aksfj989s08867 986 6tfb");

        list[0]=string;
        list[1]=string1;


        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}