package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private  int age;
        private  int wight;
        private  int rost;
        private  String  name;
        private  String  nation;
        private  boolean sex;

        public Human(){

        }
        public Human(String name, boolean sex){

        }

        public Human(String name, int age, int wight, int rost, String nation, boolean sex){

        }
        public Human(String name, int age, int wight, int rost){

        }

        public Human(String name, int age, int wight,  boolean sex){

        }

        public Human(String name, int age,  String nation, boolean sex){

        }
        public Human(String name){

        }

        public Human(String name,  String nation, boolean sex){

        }

        public Human(String name, int age, boolean sex){

        }

        public Human(String name, int age,int rost, String nation, boolean sex){

        }
    }
}
