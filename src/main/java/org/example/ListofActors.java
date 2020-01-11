package org.example;

import java.util.HashMap;
import java.util.Map;

public class ListofActors {
    public static void main (String [] args) {


        Map<String, Actors> Actors = new HashMap<>();

        Actors.put("1", new Actors("Salman", "A", "1000cr"));
        Actors.put("2", new Actors("Aamir", "B", "500cr"));

        for (Map.Entry<String, Actors> entry : Actors.entrySet()) {
            Actors actors = entry.getValue();

            System.out.println("Actor name   " + actors.getName());
            System.out.println("Best film   " + actors.getBestFilm());
            System.out.println("Earnings   " + actors.getEarnings());
        }

    }
}
