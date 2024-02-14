package com.demo.demo.controller;

import com.demo.demo.dbentity.Movies;
import com.demo.demo.repository.MovieRepository;
import com.demo.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private MovieService movieService;

    @Autowired
    MovieController(MovieService service)
    {
        this.movieService = service;
    }

    @GetMapping("/view")
    public List<Movies> viewMovies()
    {
        return movieService.fetchAll();
    }

    /**
     * Save New Movie
     * @return
     */
    @GetMapping("/save")
    public Movies saveMovie()
    {
        Movies movies = new Movies();
        movies.setName("LalSalam");
        movies.setTheatreName("KG");
        movies.setActor("Rajni");
        movies.setActress("Trisha");
        movies.setDirector("Soundarya Rajnikanth");

        return movieService.saveMovie(movies);

    }

    @GetMapping("/update")
    public Movies updateMoview()
    {
        Movies movies = new Movies();
        movies.setId(3L);
        movies.setName("LalSalam");
        movies.setTheatreName("KG");
        movies.setActor("Vishnu Vishal");
        movies.setActress("Trisha");
        movies.setDirector("Soundarya Rajnikanth");

        return movieService.updateMovie(movies);

    }

    @GetMapping("/delete")
    public String deleteMovie()
    {
        Movies movies = new Movies();
        movies.setId(2L);
        movies.setName("LalSalam");
        movies.setTheatreName("KG");
        movies.setActor("Vishnu Vishal");
        movies.setActress("Trisha");
        movies.setDirector("Soundarya Rajnikanth");

        movieService.deleteMovie(movies);
        return "Deleted";


    }



}
