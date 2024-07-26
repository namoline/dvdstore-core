package com.mycompany.dvdstore.entity;
import java.util.List;
import java.util.ArrayList;

public class Movie {
/**
 - Un titre

 - Un nombre d'exemplaires de DVD disponibles

 - Un genre

 - Un acteur principal du film

 - Éventuellement les autres acteurs du film
 */

private String title;



private String genre;

private Long id;

private String description;

    public Movie(Long id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public Movie(Long id, String title, String genre, String description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.description = description;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
