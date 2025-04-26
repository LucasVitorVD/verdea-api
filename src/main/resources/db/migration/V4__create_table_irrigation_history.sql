CREATE TABLE irrigation_history (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    water_volume DOUBLE PRECISION NOT NULL,
    soil_moisture DOUBLE PRECISION NOT NULL,
    duration_seconds INT,
    temperature DOUBLE PRECISION,
    is_automatic BOOLEAN,
    humidity_percent DOUBLE PRECISION,
    irrigation_type VARCHAR(50) NOT NULL,
    timestamp TIMESTAMP NOT NULL,
    plant_id BIGINT NOT NULL,
    device_id BIGINT NOT NULL,
    CONSTRAINT fk_irrigation_plant FOREIGN KEY (plant_id) REFERENCES plants(id),
    CONSTRAINT fk_irrigation_device FOREIGN KEY (device_id) REFERENCES devices(id)
);
