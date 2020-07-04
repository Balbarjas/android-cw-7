package com.example.aclass;

public class pokmon {
    private String title;
    private String mainActor;
    private Double movieRate;
    private int pgRate;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public Double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(Double movieRate) {
        this.movieRate = movieRate;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public pokmon(String title, String mainActor, Double movieRate, int pgRate, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movieRate = movieRate;
        this.pgRate = pgRate;
        this.genre = genre;
    }
}