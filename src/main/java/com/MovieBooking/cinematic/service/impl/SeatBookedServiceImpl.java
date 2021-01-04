package com.MovieBooking.cinematic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

import com.MovieBooking.cinematic.model.SeatBooked;
import com.MovieBooking.cinematic.repository.SeatBookedRepository;
import com.MovieBooking.cinematic.service.SeatBookedService;

@Service
@Primary
public class SeatBookedServiceImpl implements SeatBookedService {
    private SeatBookedRepository seatBookedRepository;

    @Autowired
    public SeatBookedServiceImpl(SeatBookedRepository seatBookedRepository) {
        this.seatBookedRepository = seatBookedRepository;
    }

    @Override
    public List<SeatBooked> getAllSeatBooked() {
        return seatBookedRepository.findAll();
    }

    @Override
    public SeatBooked getSeatBookedById(Long seat_booked_id) {
        return null;
    }

    @Override
    public SeatBooked pushSeatBooked(SeatBooked newSeatBooked) {
        return null;
    }

    @Override
    public SeatBooked updateSeatBooked(SeatBooked updatedSeatBooked, Long seat_booked_id) {
        return null;
    }

    @Override
    public void deleteSeatBookedById(Long seat_booked_id) {

    }
}
