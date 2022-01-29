package com.company;

import java.time.LocalDate;

public abstract class Media {
    private String title;
    private LocalDate dateOfRelease;
    private String company;
    public Media() {
        this.title = "";
        this.dateOfRelease = null;
        this.company = "";
    }

    public Media(String title, LocalDate dateOfRelease, String company) {
        this.title = title;
        this.dateOfRelease = dateOfRelease;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(LocalDate dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", dateOfRelease=" + dateOfRelease +
                ", company='" + company + '\'' +
                '}';
    }
}
