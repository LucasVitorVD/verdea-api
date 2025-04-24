package com.verdea_api.verdea.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "plants")
@Data
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String species;

    @Column(name = "watering_frequency", nullable = false)
    private Integer wateringFrequency; // em dias?

    @Column(name = "ideal_soil_moisture", nullable = false)
    private Double idealSoilMoisture;

    @Column(name = "current_soil_moisture")
    private Double currentSoilMoisture;

    @Column(name = "current_temperature")
    private Double currentTemperature;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "last_watered")
    private LocalDateTime lastWatered;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;

    @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL)
    private List<IrrigationHistory> irrigationHistories;
}
