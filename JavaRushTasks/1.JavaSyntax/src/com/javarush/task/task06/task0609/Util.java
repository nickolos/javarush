package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow( x1-x2,2.0)+Math.pow( y1-y2,2.0));
    }

    public static void main(String[] args) {
     //   System.out.println(getDistance( 4,5,3,1));
    }
}
