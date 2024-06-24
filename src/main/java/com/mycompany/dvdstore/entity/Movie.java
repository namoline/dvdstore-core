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
}
