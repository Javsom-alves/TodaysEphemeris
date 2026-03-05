package com.javson.Ephemeris.model;

import java.time.LocalDate;

public class Ephemeris {

    private String title;        // título do acontecimento
    private LocalDate date;      // data real
    private String description;  // descrição do evento

    public Ephemeris() {
    }

    public Ephemeris(String title, LocalDate date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}