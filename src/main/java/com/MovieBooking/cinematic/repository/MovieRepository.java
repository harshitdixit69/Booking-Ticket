package com.MovieBooking.cinematic.repository;

import com.MovieBooking.cinematic.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
