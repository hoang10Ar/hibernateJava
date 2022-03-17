CREATE USER 'user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'user'@'localhost';

CREATE DATABASE learning_hibernate;
USE learning_hibernate;

CREATE TABLE customer (
	id INT PRIMARY KEY,
    name VARCHAR(25)
);

SELECT * FROM customer;
