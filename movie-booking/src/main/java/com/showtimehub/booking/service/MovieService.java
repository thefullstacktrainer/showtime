package com.showtimehub.booking.service;

import com.showtimehub.booking.model.Movie;
import com.showtimehub.booking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMoviesByCity(String city) {
        return movieRepository.findByCity(city);
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }
}