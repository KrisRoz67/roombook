package com.krisroz.demo.service;

import com.krisroz.demo.repository.BlocklistRepository;
import com.krisroz.demo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final BlocklistRepository blocklistRepository;
}
