-- db/migration/V1__Create_account_and_product_tables.sql

CREATE TABLE account (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         user VARCHAR(50) NOT NULL,
                         mob VARCHAR(15) NOT NULL,
                         email VARCHAR(100) NOT NULL,
                         pass VARCHAR(100) NOT NULL
);

CREATE TABLE product (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         type VARCHAR(50) NOT NULL,
                         title VARCHAR(100) NOT NULL,
                         brand VARCHAR(50) NOT NULL,
                         price DECIMAL(10, 2) NOT NULL,
                         summary VARCHAR(255) NOT NULL,
                         cond VARCHAR(50) NOT NULL,
                         Name VARCHAR(100) NOT NULL,
                         Email VARCHAR(100) NOT NULL,
                         num VARCHAR(15) NOT NULL,
                         city VARCHAR(50) NOT NULL
);
