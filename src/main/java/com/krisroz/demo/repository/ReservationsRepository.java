package com.krisroz.demo.repository;


import com.krisroz.demo.entity.Customer;
import com.krisroz.demo.entity.Reservations;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReservationsRepository extends JpaRepository<Reservations,Long> {
}
