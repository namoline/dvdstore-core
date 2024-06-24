package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );
        FileMovieRepository movieRepository= new FileMovieRepository();
        DefaultMovieService movieService= new DefaultMovieService();

        movieService.setMovieRepository(movieRepository);
        MovieController movieController = new MovieController();
        movieController.setMovieService(movieService);

        movieController.addUsingConsole();
    }
}
