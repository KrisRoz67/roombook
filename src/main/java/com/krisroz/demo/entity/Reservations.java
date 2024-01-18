package com.krisroz.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity(name ="reservations")
@NoArgsConstructor
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate reservationDate;
    @Enumerated(EnumType.STRING)
    private Status reservationStatus;
    private Integer numberOfGuest;
    private boolean breakfast;
    private long customerId;
    private long roomId;

 public enum Status {
        CONFIRMED,
        PENDING,
        CANCELLED,
        FINISHED,
        CHANGED
 }

}