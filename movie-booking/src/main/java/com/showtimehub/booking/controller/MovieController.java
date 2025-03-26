package com.showtimehub.booking.controller;

import com.showtimehub.booking.model.Movie;
import com.showtimehub.booking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getMoviesByCity(@RequestParam String city) {
        return movieService.getMoviesByCity(city);
    }

    @PostMapping
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }
}