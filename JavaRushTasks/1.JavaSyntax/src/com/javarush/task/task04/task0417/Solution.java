package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

        public class Solution {
            public static void main(String[] args) throws Exception {
                Scanner scanner = new Scanner(System.in);
                int count1 = scanner.nextInt();
                int count2 = scanner.nextInt();
                int count3 = scanner.nextInt();
                if (count1==count2 && count1==count3){
                    System.out.println(count1+" "+count2+" "+count3);
                }
                else  if (count1==count2 ){
                    System.out.println(count1+" "+count2);
                }
                else  if (count1 == count3){
                    System.out.println(count1+" "+count3);
                }
                else  if (count2 == count3){
                    System.out.println(count2+" "+count3);
                }

            }
        }
