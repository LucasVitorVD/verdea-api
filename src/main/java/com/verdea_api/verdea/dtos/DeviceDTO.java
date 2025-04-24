package com.verdea_api.verdea.dtos;

import com.verdea_api.verdea.enums.DeviceStatus;

import java.time.LocalDateTime;

public record DeviceDTO(
        Long id,
        String name,
        String macAddress,
        DeviceStatus deviceStatus,
        Integer batteryLevel,
        LocalDateTime lastConnection,
        Integer waterLevel
) {
}
