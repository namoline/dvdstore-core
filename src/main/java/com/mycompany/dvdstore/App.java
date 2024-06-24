package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
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
        System.out.println( "Quel est le titre du film?" );
        Scanner sc= new Scanner(System.in);
        String titre= sc.nextLine();

        System.out.println( "Quel est le genre du film?" );
        Scanner sc1= new Scanner(System.in);
        String genre= sc1.nextLine();

        Movie movie= new Movie();
        movie.setGenre(genre);
        movie.setTitle(titre);

        MovieService movieService= new MovieService();
        movieService.registerMovie(movie);
    }
}
