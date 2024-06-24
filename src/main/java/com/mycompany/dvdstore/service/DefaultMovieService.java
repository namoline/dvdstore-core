package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;


public class DefaultMovieService implements MovieServiceInterface{

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    //GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
    MovieRepositoryInterface movieRepository;


    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }
}
