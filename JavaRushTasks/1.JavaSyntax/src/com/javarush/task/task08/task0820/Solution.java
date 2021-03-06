package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код

        result.add( new Cat() );
        result.add( new Cat() );
        result.add( new Cat() );
        result.add( new Cat() );
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();

        //напишите тут ваш код

        result.add( new Dog () );
        result.add( new Dog() );
        result.add( new Dog() );
        return result;

    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> result = new HashSet<>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код

         pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> iterator =pets.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //напишите тут ваш код
    static class Cat {

        public Cat(){ }

    }
    static class Dog {

        public Dog(){ }

    }
}
