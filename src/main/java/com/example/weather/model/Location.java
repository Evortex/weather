package com.example.weather.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;

    @ManyToOne
    private User user;
}