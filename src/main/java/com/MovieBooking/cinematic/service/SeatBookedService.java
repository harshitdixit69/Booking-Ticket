package com.MovieBooking.cinematic.service;

import java.util.List;

import com.MovieBooking.cinematic.model.SeatBooked;

public interface SeatBookedService {
    List<SeatBooked> getAllSeatBooked();

    SeatBooked getSeatBookedById(Long seat_booked_id);

    SeatBooked pushSeatBooked(SeatBooked newSeatBooked);

    SeatBooked updateSeatBooked(SeatBooked updatedSeatBooked, Long seat_booked_id);

    void deleteSeatBookedById(Long seat_booked_id);
}
