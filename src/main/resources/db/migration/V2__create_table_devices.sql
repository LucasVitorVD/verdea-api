CREATE TABLE devices (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    mac_address VARCHAR(17) NOT NULL UNIQUE,
    status VARCHAR(50) NOT NULL,
    battery_level INT,
    last_connection TIMESTAMP,
    water_level INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    user_id BIGINT NOT NULL,
    CONSTRAINT fk_device_user FOREIGN KEY (user_id) REFERENCES users(id)
);
