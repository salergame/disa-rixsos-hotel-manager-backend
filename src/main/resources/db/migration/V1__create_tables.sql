CREATE TABLE IF NOT EXISTS user (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    role VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS review (
    id BIGSERIAL PRIMARY KEY,
    author VARCHAR(255),
    rating INT,
    content TEXT,
    likes INT,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS room (
    id BIGSERIAL PRIMARY KEY,
    type VARCHAR(255),
    price VARCHAR(255),
    description TEXT,
    capacity VARCHAR(255),
    image TEXT
);
