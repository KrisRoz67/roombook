package com.krisroz.demo.controller;


import com.krisroz.demo.service.ReservationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/reservations")
@RequiredArgsConstructor
public class InternalReservationController {

    private final ReservationsService reservationsService;
}
