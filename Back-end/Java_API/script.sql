use qlnv;
CREATE TABLE nhanvien (
                          manv INT AUTO_INCREMENT PRIMARY KEY,
                          hoten VARCHAR(100) NOT NULL,
                          diachi VARCHAR(200),
                          dienthoai VARCHAR(20)
);

INSERT INTO nhanvien (hoten, diachi, dienthoai)
VALUES
    ('John Doe', '123 Main St, Cityville', '555-123-4567'),
    ('Jane Smith', '456 Elm St, Townsville', '555-987-6543'),
    ('Michael Johnson', '789 Oak St, Villageland', '555-555-5555');
