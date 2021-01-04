package com.MovieBooking.cinematic.repository;

import com.MovieBooking.cinematic.model.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
