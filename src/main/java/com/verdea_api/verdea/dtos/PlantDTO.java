package com.verdea_api.verdea.dtos;

import java.time.LocalDateTime;

public record PlantDTO(
        Long id,
        String name,
        String species,
        Integer wateringFrequency,
        Double idealSoilMoisture,
        Double currentSoilMoisture,
        Double currentTemperature,
        String imageUrl,
        LocalDateTime lastWatered
) {}
