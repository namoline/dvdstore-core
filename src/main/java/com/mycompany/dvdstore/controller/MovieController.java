package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {
    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    //MovieService movieService= new MovieService();
    MovieServiceInterface movieService;


    public void addUsingConsole(){
        System.out.println( "Quel est le titre du film?" );
        Scanner sc= new Scanner(System.in);
        String titre= sc.nextLine();

        System.out.println( "Quel est le genre du film?" );
        Scanner sc1= new Scanner(System.in);
        String genre= sc1.nextLine();

        Movie movie= new Movie();
        movie.setGenre(genre);
        movie.setTitle(titre);
        movieService.registerMovie(movie);
    }
}
