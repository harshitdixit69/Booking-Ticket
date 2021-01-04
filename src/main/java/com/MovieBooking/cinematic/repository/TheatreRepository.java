package com.MovieBooking.cinematic.repository;

import com.MovieBooking.cinematic.model.Theatre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
}
