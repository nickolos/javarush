package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
       Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Sim", new Cat( "gfghf" ));
        map.put("Tom", new Cat("Tom"));
        map.put("Arbus",new Cat( "Arbus"));
        map.put("Baby", new Cat("Baby"));
        map.put("Cat", new Cat("Cat"));
        map.put("Dog",new Cat( "Dog"));
        map.put("Eat",new Cat( "Eat"));
        map.put("Food",new Cat( "Food"));
        map.put("Gevey", new Cat("Gevey"));
        map.put("Hugs", new Cat("Hugs"));
        return map;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код

        Set <Cat> set = new HashSet<>(  );

        for (Map.Entry<String, Cat>  cat :map.entrySet()         ) {
           set.add( cat.getValue() );
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
