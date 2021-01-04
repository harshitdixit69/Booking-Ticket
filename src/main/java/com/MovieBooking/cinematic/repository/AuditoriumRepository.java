package com.MovieBooking.cinematic.repository;

import com.MovieBooking.cinematic.model.Auditorium;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {
}
