CREATE DATABASE libary;

CREATE TABLE libary.sach(
maSach INT NOT NULL,
tenSach VARCHAR(50) NOT NULL,
nxb VARCHAR(50) NOT NULL,
tacGia VARCHAR(50) NOT NULL,
namXB DATE,
soLanXB INT NOT NULL,
giaSach DOUBLE NOT NULL,
image VARCHAR(50) NULL,
PRIMARY KEY (maSach),
maLoai VARCHAR(50) NOT NULL,
FOREIGN KEY (maLoai) REFERENCES loaiSach(maLoai)
);

INSERT INTO libary.sach VALUES
(100, 'Listen Japan', 'Ikkai', 'Yokioto', '1990-07-19', '4', 2.000, '', 'JPD113'),
(101, 'Basic Piano', 'Princez', 'Richart Cl', '2000-12-02', '1', 1.500, '', 'PIA197'),
(102, 'Speaking Japan', 'Ikkai', 'Youkioto', '1990-08-12', '2', 2.000, '', 'JPD113'),
(103, 'JavaLab Practice', 'UK Engeer', 'Robbert', '2001-02-05', '2', 3.400, '', 'PRE192');

CREATE TABLE libary.hocSinh(
maSV VARCHAR(50) NOT NULL,
tenSV VARCHAR(50) NOT NULL,
ngaySinh DATE,
diaChi VARCHAR(50) NOT NULL,
sdt INT NOT NULL,
email VARCHAR(50) NOT NULL,
image VARCHAR(50) NULL,
PRIMARY KEY (maSV)
);

INSERT INTO libary.hocSinh VALUES
('DE120', 'Siu Nhan Do', '2001-04-01', '12-Can Giuoc', '019537387', 'gaored@yahoo', ''),
('DS120', 'Siu Nhan Den', '2002-06-02', '64-Hai Ba Trung', '067385733', 'gaoblack@yahoo', ''),
('AB120', 'Siu Nhan Vang', '2000-03-08', '22-Quang Trung', '015025238', 'gaoyl@yahoo', ''),
('FE723', 'Siu Nhan Hong', '2001-05-17', '58-Le Thai To', '0638478122', 'gaopink@yahoo', ''),
('LS520', 'Siu Nhan Trang', '2007-06-07', '62-Ba Dinh', '026346434', 'gaowhite@yahoo', '');

CREATE TABLE libary.phieuMuon(
maPhieu INT NOT NULL PRIMARY KEY,
maSV VARCHAR(50) NOT NULL,
FOREIGN KEY (maSV) REFERENCES hocSinh(maSV),
ngayMuon DATE,
ngayTra DATE,
status VARCHAR(50) NULL
);

INSERT INTO libary.phieuMuon VALUES
(01, 'DE120', '2021-06-09', '2021-07-09', 'Done'),
(02, 'DS120', '2019-04-25', '2019-05-25', 'Not'),
(03, 'LS520', '2019-02-18', '2019-03-18', 'Not'),
(04, 'FE723', '2020-06-19', '2020-07-19', 'Done'),
(05, 'AB120', '2021-01-05', '2021-03-31', 'Done');

CREATE TABLE libary.loaiSach(
maLoai VARCHAR(50) NOT NULL,
tenLoai VARCHAR(50) NOT NULL,
PRIMARY KEY (maLoai)
);

INSERT INTO libary.loaiSach VALUES
('JPD113', 'Japan Language'),
('DBI221', 'Database Increate'),
('PRE192', 'Project Engerneer'),
('PIA197', 'Piano Musical'),
('SC230', 'Skill Comunicate');

CREATE TABLE libary.sach_phieu(
maPhieu INT NOT NULL,
FOREIGN KEY (maPhieu) REFERENCES phieuMuon(maPhieu),
maSach INT NOT NULL,
FOREIGN KEY (maSach) REFERENCES sach(maSach)
);

INSERT INTO libary.sach_phieu VALUES
(01, 102),
(02, 100),
(03, 102),
(04, 101),
(05, 103);

