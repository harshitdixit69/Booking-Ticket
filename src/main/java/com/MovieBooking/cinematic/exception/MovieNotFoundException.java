package com.MovieBooking.cinematic.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Long movie_id) {
    }
}
