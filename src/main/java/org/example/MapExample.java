package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
public static void main(String args []) {

    Map<String, Integer> person1 = new HashMap<>();
    person1.put("Age", 25);
    person1.put("Weight", 50);

    Map<String, Integer> person2 = new HashMap<>();
    person2.put("Age", 15);
    person2.put("Weight", 55);

    System.out.println(person1 +"------------"+ person2);


}
}
