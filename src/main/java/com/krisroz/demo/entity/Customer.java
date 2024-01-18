package com.krisroz.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
    @Data
    @Entity(name ="customer")
    @NoArgsConstructor
    public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String fullname;
        private String email;
        private String phoneNumber;

}
