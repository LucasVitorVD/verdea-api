package com.verdea_api.verdea.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "O nome é obrigatório")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "A espécie é obrigatória")
    @Column(nullable = false)
    private String species;

    @Min(value = 1, message = "A frequência de rega deve ser pelo menos 1 dia")
    @Column(name = "watering_frequency", nullable = false)
    private Integer wateringFrequency;

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
