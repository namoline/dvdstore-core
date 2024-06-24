package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );
        GoLiveMovieRepository movieRepository= new GoLiveMovieRepository();
        MovieService movieService= new MovieService();

        movieService.setMovieRepository(movieRepository);
        MovieController movieController = new MovieController();
        movieController.setMovieService(movieService);

        movieController.addUsingConsole();
    }
}
