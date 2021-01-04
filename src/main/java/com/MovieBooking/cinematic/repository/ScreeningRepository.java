package com.MovieBooking.cinematic.repository;

import com.MovieBooking.cinematic.model.Screening;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ScreeningRepository extends JpaRepository<Screening, Long> {}
