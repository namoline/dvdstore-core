package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import java.util.List;

public interface MovieServiceInterface {
    public void registerMovie(Movie movie);
    public List<Movie> getMovieList();

}
