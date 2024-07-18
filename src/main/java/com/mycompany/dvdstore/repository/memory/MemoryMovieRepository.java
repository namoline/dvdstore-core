package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {
    private static long lastId=0;
    public final static List<Movie> movies= new ArrayList<>();

    public Movie add(Movie movie){
        movie.setId(lastId++);
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
        return movie;
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override
    public Movie getById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
}
