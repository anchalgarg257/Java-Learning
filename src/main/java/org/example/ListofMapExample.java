package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class ListofMapExample {
    public static void main(String [] args) {

        List<Map<String, Integer>> list = new ArrayList<>();

        Map<String, Integer> person1 = new HashMap<>();
        person1.put("Age", 25);
        person1.put("Weight", 50);
        list.add(person1);

        System.out.println(list);

        Map<String, Integer> person2 = new HashMap<>();
        person2.put("Age", 15);
        person2.put("Weight", 55);
        list.add(person2);

        System.out.println(list);


    }
}
