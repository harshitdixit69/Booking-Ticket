package com.MovieBooking.cinematic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.MovieBooking.cinematic.model.Auditorium;
import com.MovieBooking.cinematic.service.AuditoriumService;

@RestController
public class AuditoriumController {
    private AuditoriumService auditoriumService;

    @Autowired
    public AuditoriumController(AuditoriumService auditoriumService) {
        this.auditoriumService = auditoriumService;
    }

    @GetMapping("/auditoriums")
    public List<Auditorium> getAllTheatres() {
        return auditoriumService.getAllAuditoriums();
    }
}
