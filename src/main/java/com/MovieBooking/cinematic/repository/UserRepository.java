package com.MovieBooking.cinematic.repository;

import com.MovieBooking.cinematic.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
