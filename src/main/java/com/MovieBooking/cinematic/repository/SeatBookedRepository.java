package com.MovieBooking.cinematic.repository;

import com.MovieBooking.cinematic.model.SeatBooked;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatBookedRepository extends JpaRepository<SeatBooked, Long> {
}
