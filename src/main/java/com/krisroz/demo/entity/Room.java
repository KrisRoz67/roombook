package com.krisroz.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name ="room")
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private RoomType name;
    private Integer maxNumberOfGuests;
    @Enumerated(EnumType.STRING)
    private Bed bedType;

    public enum RoomType {
    SINGLE,
    DOUBLE,
    SUITE
}
    public enum Bed {
        SINGLE,
        DOUBLE,
    }

}

