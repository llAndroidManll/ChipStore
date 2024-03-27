-- Create the database
CREATE DATABASE IF NOT EXISTS my_db;
USE my_db;

SET FOREIGN_KEY_CHECKS = 0;

-- Create the 'users' table
-- Create the 'users' table
CREATE TABLE users (
                        id             BIGINT PRIMARY KEY AUTO_INCREMENT,
                        password       VARCHAR(255) NOT NULL,
                        email          VARCHAR(255) NOT NULL,
                        full_name      VARCHAR(255) NOT NULL,
                        phone_number   VARCHAR(255) NOT NULL,
                        role_id        BIGINT NOT NULL,
                        enabled        BOOLEAN NOT NULL,
                        UNIQUE INDEX email_UNIQUE (email ASC),
                        UNIQUE INDEX phone_number_UNIQUE (phone_number ASC),
                        FOREIGN KEY (role_id) REFERENCES roles(role_id)
);

-- Create the 'roles' table
CREATE TABLE roles (
                       role_id     BIGINT PRIMARY KEY AUTO_INCREMENT,
                       role        VARCHAR(255) NOT NULL,
                       UNIQUE INDEX name_UNIQUE (role ASC)
);

-- Create the 'products' table
CREATE TABLE products (
                        product_id    BIGINT PRIMARY KEY AUTO_INCREMENT,
                        product_name  VARCHAR(100),
                        price         INT,
                        discount      INT,
                        description   TEXT,
                        f_image       BLOB,
                        image_1       BLOB,
                        image_2       BLOB,
                        image_3       BLOB
);

CREATE TABLE colors (
                        color_id INT PRIMARY KEY AUTO_INCREMENT,
                        color_name VARCHAR(50) UNIQUE
);

-- Create a table to establish the many-to-many relationship between products and colors
CREATE TABLE product_colors (
                        product_id BIGINT,
                        color_id INT,
                        PRIMARY KEY (product_id, color_id),
                        FOREIGN KEY (product_id) REFERENCES products(product_id),
                        FOREIGN KEY (color_id) REFERENCES colors(color_id)
);

-- LAST LINE
SET FOREIGN_KEY_CHECKS = 1;

-- Insert predefined roles
INSERT INTO roles (role_id, role) VALUES
                                      (1, 'USER'),
                                      (2, 'ADMIN');
