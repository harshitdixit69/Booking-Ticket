package com.MovieBooking.cinematic.service;

import java.util.List;

import com.MovieBooking.cinematic.model.Seat;

public interface SeatService {
    List<Seat> getAllSeats();

    Seat getSeatById(Long seat_id);

    Seat pushSeat(Seat newSeat);

    Seat updateSeat(Seat updatedSeat, Long seat_id);

    void deleteSeatById(Long seat_id);
}
