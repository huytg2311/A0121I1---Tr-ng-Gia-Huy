CREATE DATABASE bai2_bt;

CREATE TABLE bai2_bt.customers (
	customer_number INT AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    address VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    phone VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY (customer_number)
);

INSERT INTO bai2_bt.customers VALUES
(1, 'Nguyen Van A', 'Đà Nẵng', 'a1@gmail.com', '0159244138'),
(2, 'Nguyen Van B', 'Hà Nội', 'b1@gmail.com', '0572960243'),
(3, 'Nguyen Van C', 'Hà Tĩnh', 'c1@gmail.com', '0931850209'),
(4, 'Nguyen Van D', 'Nghệ An', 'd1@gmail.com', '0265924580');


CREATE TABLE bai2_bt.accounts (
	account_number INT AUTO_INCREMENT PRIMARY KEY,
    account_type VARCHAR(50) NOT NULL,
    date DATE NOT NULL,
    balance INT NOT NULL,
    customer_number INT,
    FOREIGN KEY (customer_number)
	REFERENCES bai2_bt.customers(customer_number),
    CHECK (account_type IN ('vip', 'thuong', 'doanh nghiep'))
);

INSERT INTO bai2_bt.accounts VALUES
(100, 'thuong', '2015-06-23', 200000, 1),
(101, 'doanh nghiep', '2015-01-10', 10000000, 2),
(102, 'vip', '2015-08-12', 5000000, 3),
(103, 'vip', '2015-05-31', 1000000, 4);

CREATE TABLE bai2_bt.transactions (
	transaction_number INT PRIMARY KEY,
    date DATE NOT NULL,
    amounts INT NOT NULL,
    descriptions VARCHAR(255),
    account_number INT,
    FOREIGN KEY (account_number)
    REFERENCES bai2_bt.accounts(account_number)
);

INSERT INTO bai2_bt.transactions VALUES
(1022045, '2017-03-04', 100000, 'Nop hoc phi', 100),
(1022030, '2017-05-04', 100000, 'Nop hoc phi', 101),
(1022430, '2017-04-04', 200000,  'Chuyen khoan', 102),
(1022041, '2017-06-04', 500000, 'Tien bao hiem', 103);
