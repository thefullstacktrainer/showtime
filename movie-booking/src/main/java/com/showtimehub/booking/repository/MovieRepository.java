package com.showtimehub.booking.repository;

import com.showtimehub.booking.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    List<Movie> findByCityIgnoreCase(String city);
}