package com.MovieBooking.cinematic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

import com.MovieBooking.cinematic.exception.AuditoriumNotFoundException;
import com.MovieBooking.cinematic.model.Auditorium;
import com.MovieBooking.cinematic.repository.AuditoriumRepository;
import com.MovieBooking.cinematic.service.AuditoriumService;

@Service
@Primary
public class AuditoriumServiceImpl implements AuditoriumService {
    private AuditoriumRepository auditoriumRepository;

    @Autowired
    public AuditoriumServiceImpl(AuditoriumRepository auditoriumRepository) {
        this.auditoriumRepository = auditoriumRepository;
    }

    @Override
    public List<Auditorium> getAllAuditoriums() {
        return auditoriumRepository.findAll();
    }

    @Override
    public Auditorium getAuditoriumById(Long auditorium_id) {
        return auditoriumRepository.findById(auditorium_id)
                .orElseThrow(() -> new AuditoriumNotFoundException(auditorium_id));
    }

    @Override
    public Auditorium pushAuditorium(Auditorium newAuditorium) {
        Auditorium auditorium = auditoriumRepository.save(newAuditorium);
        return auditorium;
    }

    @Override
    public Auditorium updateAuditorium(Auditorium updatedAuditorium, Long auditorium_id) {
        return auditoriumRepository.findById(auditorium_id).map(auditorium -> {
            auditorium.setTheatre(updatedAuditorium.getTheatre());
            auditorium.setSeats(updatedAuditorium.getSeats());
            auditorium.setSeatCount(updatedAuditorium.getSeatCount());
            auditorium.setScreenings(updatedAuditorium.getScreenings());

            return auditoriumRepository.save(auditorium);
        }).orElseGet(() -> {
            updatedAuditorium.setId(auditorium_id);
            return auditoriumRepository.save(updatedAuditorium);
        });
    }

    @Override
    public void deleteAuditoriumById(Long auditorium_id) {
        auditoriumRepository.deleteById(auditorium_id);
    }
}
