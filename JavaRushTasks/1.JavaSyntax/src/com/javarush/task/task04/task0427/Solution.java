package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count>999 || count<1){

        }
        else if (count%2==0) {
            if(count/100!=0){
                System.out.println("четное трехзначное число");
            }
            else if (count/10!=0){
                System.out.println("четное двузначное число");
            }
            else {
                System.out.println("четное однозначное число");
            }
        }
        else {
            if(count/100!=0){
                System.out.println("нечетное трехзначное число");
            }
            else if (count/10!=0){
                System.out.println("нечетное двузначное число");
            }
            else {
                System.out.println("нечетное однозначное число");
            }
        }

    }
}
