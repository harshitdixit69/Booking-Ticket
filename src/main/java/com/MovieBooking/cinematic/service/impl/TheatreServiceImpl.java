package com.MovieBooking.cinematic.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

import com.MovieBooking.cinematic.model.Theatre;
import com.MovieBooking.cinematic.repository.TheatreRepository;
import com.MovieBooking.cinematic.service.TheatreService;

@Service
@Primary
public class TheatreServiceImpl implements TheatreService {
    private TheatreRepository theatreRepository;

    public TheatreServiceImpl(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }


    @Override
    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }

    @Override
    public Theatre getTheatreById(Long theatre_id) {
        return null;
    }

    @Override
    public Theatre pushTheatre(Theatre newTheatre) {
        return null;
    }

    @Override
    public Theatre updateTheatre(Theatre updatedTheatre, Long theatre_id) {
        return null;
    }

    @Override
    public void deleteTheatreById(Long theatre_id) {

    }
}
