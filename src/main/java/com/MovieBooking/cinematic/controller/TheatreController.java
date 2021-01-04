package com.MovieBooking.cinematic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.MovieBooking.cinematic.model.Theatre;
import com.MovieBooking.cinematic.service.TheatreService;

@RestController
public class TheatreController {
    private TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("/theatres")
    public List<Theatre> getAllTheatres() {
        return theatreService.getAllTheatres();
    }
}
