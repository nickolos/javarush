package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/
public class Solution {
    public static void main(String[] args) {
       Person person = new Person();
    }

    public static class Person {
       String name="Person";
       int age = 3;
       int weight = 6;
       int money = 3;
    }
}
