package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListofBean {
    public static void main(String[] args) {

        List<Actors> list = new ArrayList<>();
        list.add(new Actors("Anchal", "A", "1"));
        list.add(new Actors("Anc", "B", "2"));
        System.out.println(list);

        Iterator<Actors> crunchifyIterator = list.iterator();
        while (crunchifyIterator.hasNext()) {

            Actors actors = crunchifyIterator.next();
            System.out.println("Name  " + actors.getName());
        }
    }
}
