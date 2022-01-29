package com.company;

import java.time.LocalDate;

public class Books extends Media{
    private String author;
    public Books() {
        this.author="";
    }

    public Books(String title, LocalDate dateOfRelease, String company,String author) {
        super(title, dateOfRelease, company);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +super.toString()+
                "author='" + author + '\'' +
                '}';
    }
}
