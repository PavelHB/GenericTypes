package com.company;

import java.time.LocalDate;

public class Newspapers extends Media{

    public Newspapers() {

    }

    public Newspapers(String title, LocalDate dateOfRelease, String company) {
        super(title, dateOfRelease, company);
    }

    @Override
    public String toString() {
        return "Newspapers{}" + super.toString();
    }
}
