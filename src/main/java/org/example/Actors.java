package org.example;

public class Actors {
    private String name;
    private String bestFilm;
    private String earnings;

    public Actors(String name, String bestFilm, String earnings) {
        this.name = name;
        this.bestFilm = bestFilm;
        this.earnings = earnings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBestFilm() {
        return bestFilm;
    }

    public void setBestFilm(String bestFilm) {
        this.bestFilm = bestFilm;
    }

    public String getEarnings() {
        return earnings;
    }

    public void setEarnings(String earnings) {
        this.earnings = earnings;
    }
}
