package com.company;

import java.time.LocalDate;

public class Movies extends Media{
    private String directors;
    private String actors;

    public Movies() {
        this.actors="";
        this.directors="";
    }

    public Movies(String title, LocalDate dateOfRelease, String company,String directors, String actors) {
        super(title, dateOfRelease, company);
        this.actors=actors;
        this.directors=directors;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movies{" + super.toString()+
                "directors='" + directors + '\'' +
                ", actors='" + actors + '\'' +
                '}';
    }
}
