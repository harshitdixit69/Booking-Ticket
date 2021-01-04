package com.MovieBooking.cinematic.scheduled_task;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.stream.Collectors;

import com.MovieBooking.cinematic.repository.ScreeningRepository;

import static java.time.temporal.ChronoUnit.DAYS;

@Slf4j
@Component
public class DeleteSevenDayOldScreening {
    private ScreeningRepository screeningRepository;

    @Autowired
    public DeleteSevenDayOldScreening(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    @Scheduled(cron = "0 0 0 * * ?")
    public void deleteSevenDayOldScreening() {
        LocalDate today = LocalDate.now();

        screeningRepository.deleteInBatch(screeningRepository.findAll().stream()
                .filter(screening -> DAYS.between(screening.getDate(), today) > 7).collect(Collectors.toList()));
    }
}
