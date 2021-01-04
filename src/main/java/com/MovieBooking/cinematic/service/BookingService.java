package com.MovieBooking.cinematic.service;

import java.util.List;

import com.MovieBooking.cinematic.model.Booking;

public interface BookingService {
    List<Booking> getAllBookings();

    Booking getBookingById(Long booking_id);

    Booking pushBooking(Booking newBooking);

    Booking updateBooking(Booking updatedBooking, Long booking_id);

    void deleteBookingById(Long booking_id);
}

