package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Количество букв
*/
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        // алфавит
//        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
//        char[] abcArray = abc.toCharArray();
//
//        ArrayList<Character> alphabet = new ArrayList<Character>();
//        for (int i = 0; i < abcArray.length; i++) {
//            alphabet.add(abcArray[i]);
//        }
//
//        // ввод строк
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < 10; i++) {
//            String s = reader.readLine();
//            list.add(s.toLowerCase());
//        }
//
//        // напишите тут ваш код
//        for (int i = 0; i < alphabet.size(); i++) { //  начало подсчета вхождений букв алфавита.
//            int count=0;                            //счетчик совпадений
//            for (String a : list  ) {
//                char[] ch_array =a.toCharArray();  // разбил строку на массив из букв
//                for (char b : ch_array) {            // сравниваю каждую букву с буквой из алфавита . Если совпадает ,то увеличиваю счетчик
//                    if(alphabet.get(i).equals(b)){
//                        count++;
//                    }
//                }
//            }
//            if (i==alphabet.size()-1){
//                System.out.print(alphabet.get(i)+" "+count); // Перед переходом на следующую букву алфавита вывожу данные на экран .
//
//            }else{
//                System.out.println(alphabet.get(i)+" "+count); }// Перед переходом на следующую букву алфавита вывожу данные на экран .
//        }
//    }
//}

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        int [] mas =new int[33];

        for (int i = 0; i <list.size() ; i++) {
            Pattern p = Pattern.compile("[^а-я]");
            Matcher m = p.matcher(list.get( i ));
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < list.get( i ).length(); j++) {
                if (m.find()){
                    m.appendReplacement(sb, "");
                }
            }
            for (int j = 0; j <sb.length() ; j++) {

                mas [alphabet.indexOf( sb.charAt( j ))]++;
            }

        }
        //вывод

        for (int i = 0; i <mas.length ; i++) {
            System.out.println(alphabet.get( i )+" "+mas[i]);

        }


    }

}