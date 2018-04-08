package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human Olga = new Human( "Olga", false, 28,new ArrayList<Human>());
        Human Max = new Human( "Max", true, 23, new ArrayList<Human>() );
        Human Nick = new Human( "Nick", true, 19, new ArrayList<Human>() );
        ArrayList <Human> children1 = new ArrayList<>();
        children1.add(Nick);
        children1.add(Max);
        children1.add(Olga);
        Human Tim = new Human( "Tim", true, 45, children1 );
        Human Miranda = new Human( "Miranda", false, 43, children1);
        ArrayList <Human> children2 = new ArrayList<>();
        children2.add(Tim);
        Human Tuck = new Human( "Tuck", true, 76 ,children2);
        Human Kate = new Human( "Kate", false, 76, children2);

        ArrayList <Human> children3 = new ArrayList<>();
        children3.add(Miranda);
        Human Ann = new Human( "Ann", false, 76, children3);
        Human Victor = new Human( "Victor", true, 79 ,children3);

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
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        ArrayList <Human> children = new ArrayList<>();


        public Human(final String name,final boolean sex ,final int age, final  ArrayList <Human> children  ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;

        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
