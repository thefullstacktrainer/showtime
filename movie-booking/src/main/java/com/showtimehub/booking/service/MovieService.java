package com.showtimehub.booking.service;

import com.showtimehub.booking.model.Movie;
import com.showtimehub.booking.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public List<Movie> getMoviesByCity(String city) {
        return movieRepository.findByCityIgnoreCase(city);
    }

    public Movie getMovieById(String id) {
        return movieRepository.findById(new ObjectId(id)).orElse(null);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(String id) {
        movieRepository.deleteById(new ObjectId(id));
    }
}