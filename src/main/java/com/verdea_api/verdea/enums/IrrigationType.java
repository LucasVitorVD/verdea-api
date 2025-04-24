package com.verdea_api.verdea.enums;

public enum IrrigationType {
    AUTOMATIC("Automática"),
    SCHEDULED("Agendada");

    private final String description;

    IrrigationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}