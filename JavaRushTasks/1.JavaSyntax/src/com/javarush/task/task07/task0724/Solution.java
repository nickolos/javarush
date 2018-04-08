package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human Ann = new Human( "Ann", false, 76 );
        Human Victor = new Human( "Victor", true, 79 );
        Human Tuck = new Human( "Tuck", true, 76 );
        Human Kate = new Human( "Kate", false, 76 );
        Human Tim = new Human( "Tim", true, 45, Ann, Victor );
        Human Miranda = new Human( "Miranda", false, 43, Kate, Tuck );
        Human Olga = new Human( "Olga", false, 28, Miranda, Tim );
        Human Max = new Human( "Max", true, 23, Miranda, Tim );
        Human Nick = new Human( "Nick", true, 19, Miranda, Tim );


        System.out.println(Victor.toString());
        System.out.println(Tuck.toString());
        System.out.println(Ann.toString());
        System.out.println(Kate.toString());
        System.out.println(Tim.toString());
        System.out.println(Miranda.toString());
        System.out.println(Olga.toString());
        System.out.println(Max.toString());
        System.out.println(Nick.toString());
    }

    public static class Human {
        private  String name;
        private  boolean sex;
        private int age;
        private Human mother;
        private Human father;

        public Human(final String name,final boolean sex ,final int age ){
            this.name = name;
            this.age = age;
            this.sex = sex;

        }

        public Human(final String name,final boolean sex ,final int age, final Human mother, final Human father ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;

        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















