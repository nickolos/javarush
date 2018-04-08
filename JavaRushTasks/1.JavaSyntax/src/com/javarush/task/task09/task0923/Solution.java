package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner( System.in );
        String text = scanner.nextLine().replaceAll( " ","" );
        StringBuilder vowel = new StringBuilder( 100 );
        StringBuilder nonvowel = new StringBuilder( 100 );
        for (int i = 0; i <text.length() ; i++) {
            if (isVowel( text.charAt( i ) )){
                vowel.append( text.charAt( i ) ).append( " " );
            }
            else {
                nonvowel.append( text.charAt( i ) ).append( " " );
            }
        }
        System.out.println(vowel);

        System.out.println(nonvowel);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}