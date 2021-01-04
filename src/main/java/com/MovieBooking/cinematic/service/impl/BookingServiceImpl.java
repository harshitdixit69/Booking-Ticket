package com.MovieBooking.cinematic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

import com.MovieBooking.cinematic.model.Booking;
import com.MovieBooking.cinematic.repository.BookingRepository;
import com.MovieBooking.cinematic.service.BookingService;

@Service
@Primary
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long booking_id) {
        return null;
    }

    @Override
    public Booking pushBooking(Booking newBooking) {
        return null;
    }

    @Override
    public Booking updateBooking(Booking updatedBooking, Long booking_id) {
        return null;
    }

    @Override
    public void deleteBookingById(Long booking_id) {

    }
}

