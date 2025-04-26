CREATE TABLE plants (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    species VARCHAR(255) NOT NULL,
    watering_frequency INT NOT NULL,
    ideal_soil_moisture DOUBLE PRECISION NOT NULL,
    current_soil_moisture DOUBLE PRECISION,
    current_temperature DOUBLE PRECISION,
    image_url VARCHAR(512),
    last_watered TIMESTAMP,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    user_id BIGINT NOT NULL,
    device_id BIGINT NOT NULL,
    CONSTRAINT fk_plant_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_plant_device FOREIGN KEY (device_id) REFERENCES devices(id)
);
