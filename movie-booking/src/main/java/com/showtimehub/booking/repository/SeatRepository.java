package com.showtimehub.booking.repository;

import com.showtimehub.booking.model.Seat;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends MongoRepository<Seat, ObjectId> {
    List<Seat> findByShow(ObjectId showId);
}