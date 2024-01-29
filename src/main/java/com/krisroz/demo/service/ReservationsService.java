package com.krisroz.demo.service;


import com.krisroz.demo.repository.ReservationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationsService {

    private final ReservationsRepository reservationsRepository;
}
