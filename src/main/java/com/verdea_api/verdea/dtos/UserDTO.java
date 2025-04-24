package com.verdea_api.verdea.dtos;

import java.time.LocalDateTime;

public record UserDTO(
        Long id,
        String name,
        String email,
        LocalDateTime createdAt
) {}
