package com.demo.demo.service;


import com.demo.demo.dbentity.Movies;
import com.demo.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    @Autowired
    private MovieRepository movieRepository;

    /**
     * Create New Movie
     * @param movies
     * @return
     */
    public Movies saveMovie(Movies movies)
    {
        Movies movies1 = movieRepository.save(movies);
        return movies1;
    }

    /**
     * Update
     * @param movies
     * @return
     */
    public Movies updateMovie(Movies movies)
    {
        Movies movies1 = movieRepository.save(movies);
        return movies1;
    }

    /**
     * Delete Movie
     * @param movies
     */
    public void deleteMovie(Movies movies)
    {
           movieRepository.delete(movies);
    }

    public List<Movies> fetchAll()
    {
        return movieRepository.findAll();
    }





}
