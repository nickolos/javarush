package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        if (one != two && three!= two && three !=one){

        }
        else if (one == two && three!= two ){
            System.out.println(3);
        }
        else if (one == three && three!= two ){
            System.out.println(2);
        }
        else {
            System.out.println(1);
        }
    }
}
