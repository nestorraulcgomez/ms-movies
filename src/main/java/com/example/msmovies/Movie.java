package com.example.msmovies;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private String year;
    private String director;
    private String synopsis;

    public Movie(int id, String title, String genre, String year, String director, String synopsis) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.synopsis = synopsis;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getSynopsis() {
        return synopsis;
    }

}
