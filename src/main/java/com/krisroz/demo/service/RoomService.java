package com.krisroz.demo.service;

import com.krisroz.demo.repository.RoomRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepostory roomRepostory;
}
