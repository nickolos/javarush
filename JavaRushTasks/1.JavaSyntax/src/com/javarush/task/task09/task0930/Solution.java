package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        List<String> mas_string = new ArrayList<>();
        List<Integer> mas_int = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) mas_int.add(-Integer.parseInt(array[i]));
            else mas_string.add(array[i]);

        }

            for (int i = 0; i <mas_string.size()-1 ; i++) {
                for (int j = i+1; j <mas_string.size() ; j++) {
                    if (isGreaterThan(mas_string.get(i),mas_string.get(j))){
                        String t =mas_string.get(i);
                        mas_string.set(i,mas_string.get(j));
                        mas_string.set(j,t);
                    }
                }
            }


        Collections.sort(mas_int);

        for (int i = 0; i <mas_int.size() ; i++) {
            mas_int.set(i,mas_int.get(i)*-1);
        }
        int t_st =0;
        int t_in=0;

        for (int i = 0; i <array.length ; i++) {
            if (isNumber(array[i])) {
                array[i]=mas_int.get(t_in).toString();
                t_in++;
            }
            else {
                array[i]=mas_string.get(t_st);
                t_st++;
            }
        }
    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
