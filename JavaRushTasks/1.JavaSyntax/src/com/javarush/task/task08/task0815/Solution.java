package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>(  );
                for (int j = 0; j < 10; j++) {
                    hashMap.put( "Силаков"+j,"Николай" );
                }
        return hashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count=0;
        for (Map.Entry <String,String> set : map.entrySet() ) {
            if (set.getValue().equals( name)) count++;

        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count=0;
        for (Map.Entry <String,String> set : map.entrySet() ) {
            if (set.getKey().equals( lastName )) count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(getCountTheSameFirstName( createMap(),"Силаков" ));
//        System.out.println(getCountTheSameLastName( createMap(),"Николай" ));
//        System.out.println(createMap());
    }
}
