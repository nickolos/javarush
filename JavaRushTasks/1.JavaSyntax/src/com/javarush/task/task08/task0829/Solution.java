package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of name
        List<String> TownWithName = new ArrayList<String>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) break;
            TownWithName.add(town);
            String family = reader.readLine();
            TownWithName.add(family);
        }

        //read home number
        String townName = reader.readLine();
        for (int i = 0; i < TownWithName.size()-1; i++) {

            if (townName.equals(TownWithName.get(i))) {
                System.out.println(TownWithName.get(i + 1));
            }
        }
    }
}
