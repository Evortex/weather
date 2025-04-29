package com.example.weather.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Session {
    @Id
    private UUID id;

    @ManyToOne
    private User user;

    private LocalDateTime expiresAt;
}
