package com.verdea_api.verdea.entities;

import com.verdea_api.verdea.enums.IrrigationType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "irrigation_history")
@Data
public class IrrigationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "water_volume", nullable = false)
    private Double waterVolume;

    @Column(name = "soil_moisture", nullable = false)
    private Double soilMoisture;

    @Column(name = "duration_seconds")
    private Integer durationSeconds;

    @Column(name = "temperature")
    private Double temperature;

    @Column(name = "is_automatic")
    private Boolean isAutomatic;

    @Column(name = "humidity_percent")
    private Double humidityPercent;

    @Enumerated(EnumType.STRING)
    @Column(name = "irrigation_type", nullable = false)
    private IrrigationType irrigationType;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "plant_id", nullable = false)
    private Plant plant;

    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;
}