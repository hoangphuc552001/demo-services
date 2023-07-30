CREATE DATABASE IF NOT EXISTS qltc;
USE qltc;

CREATE TABLE nhanvien (
                          manv INT AUTO_INCREMENT PRIMARY KEY,
                          hoten VARCHAR(100) NOT NULL,
                          diachi VARCHAR(200),
                          dienthoai VARCHAR(20),
                          luong DECIMAL(10, 2),
                          heso FLOAT,
                          bangcap VARCHAR(50),
                          namsinh INT,
                          noisinh VARCHAR(100),
                          thuongtru VARCHAR(200),
                          cho_o_hien_tai VARCHAR(200)
);

USE qltc;

INSERT INTO nhanvien (hoten, diachi, dienthoai, luong, heso, bangcap, namsinh, noisinh, thuongtru, cho_o_hien_tai)
VALUES
    ('John Doe', '123 Main St, Cityville', '555-123-4567', 4500.00, 1.5, 'Bachelor of Science', 1985, 'Cityville', '123 Main St, Cityville', '456 Elm St, Townsville'),
    ('Jane Smith', '456 Elm St, Townsville', '555-987-6543', 5200.00, 1.75, 'Master of Arts', 1990, 'Townsville', '456 Elm St, Townsville', '789 Oak St, Villageland'),
    ('Michael Johnson', '789 Oak St, Villageland', '555-555-5555', 3800.00, 1.25, 'Bachelor of Commerce', 1988, 'Villageland', '789 Oak St, Villageland', '789 Oak St, Villageland');

