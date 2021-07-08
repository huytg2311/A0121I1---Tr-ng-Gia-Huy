CREATE DATABASE shop_car;
-- ---------------CUSTOMERS-----------------------
CREATE TABLE shop_car.customers(
customerNumber int not null,
customerName varchar(50) not null,
contactLastName varchar(50) not null,
contactFirstName varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(255) null,
city varchar(50) not null,
state varchar(50) not null,
postalCode varchar(15) not null,
country varchar(50) not null,
creditLimit double null,
primary key (customerNumber),
salesRepEmployeeNumber int not null,
foreign key (salesRepEmployeeNumber) references employees(employeeNumber)
);

insert into shop_car.customers values
(1, 'Gao Do', 'Do', 'Gao', '0749584857', 'Japan', 'Bao Mat', 'Japan', 'None', '4+774', 'Viet Nam', 1.000, 100),
(2, 'Gao Bac', 'Bac', 'Gao', '0456878225', 'Viet Nam', 'Bao Mat', 'Da Nang', 'None', '+84', 'Quang Nam', 2.000, 101),
(3, 'Gao Trang', 'Trang', 'Gao', '0674476229', 'Japan', 'Bao Mat', 'Japan', 'None', '4+774', 'Hue', 3.000, 102),
(4, 'Gao Vang', 'Vang', 'Gao', '0563848563', 'America', 'Bao Mat', 'New York', 'None', '1+287', 'Banlades', 4.000, 103)
;

-- ------------------------ORDERS--------------------------------------------
create table shop_car.orders(
orderNumber int not null primary key,
orderDate date not null,
requiredDate date not null,
shippedDate date not null,
status varchar(15) not null,
comments text null,
quantityOrdered int not null,
priceEach double not null,
customerNumber int not null,
foreign key (customerNumber) references customers(customerNumber)
);

insert into shop_car.orders values
(10, '2001-01-15', '2001-01-20', '2001-01-19', 'Happy', 'Dong goi can than', 1, 1.000, 1),
(11, '2007-12-02', '2001-12-05', '2001-12-04', 'Normal', '', 3, 4.000, 2),
(12, '2009-10-20', '2009-10-25', '2009-10-22', 'Normal', '', 1, 5.000, 3),
(13, '2004-08-02', '2004-08-04', '2004-08-04', 'Normal', '', 2, 2.000, 4)
;
-- ----------------PAYMENTS--------------------------
create table shop_car.payments(
customerNumber int not null,
foreign key (customerNumber) references customers(customerNumber),
checkNumber varchar(50) not null,
paymentDate date not null,
amount double null
);

insert into shop_car.payments values
(1, 'NG105', '2001-01-19', 1.000),
(2, 'KY483', '2001-12-04', 4.000),
(3, 'YJ783', '2009-10-22', 5.000),
(4, 'LK120', '2004-08-04', 2.000)
;
-- -----------------PRODCUTS-------------------------------
create table shop_car.products(
productCode varchar(15) not null primary key,
productName varchar(70) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription text not null,
quanityInStock int not null,
buyPrice double not null,
MSRP double not null,
productLine varchar(50) not null,
foreign key (productLine) references productlines(productLine)
);

insert into shop_car.products values
('P01', 'Mescedes', 'Big', 'Viet Nam', 'VIP', '200', 10.000, 15.000, 'TX882'),
('P02', 'Honda', 'Normal', 'Viet Nam', 'Normal', '100', 5.000, 7.000, 'LJ449'),
('P03', 'Kia', 'Big', 'Korea', 'Normal', '20', 4.000, 6.000, 'AX110'),
('P04', 'Toyota', 'Big', 'Japan', 'VIP', '50', 10.000, 15.000, 'LL445')
;

-- -----------PRODUCTLINES------------------------
create table shop_car.productlines(
productLine varchar(50) not null primary key,
textDescription varchar(255) null,
image varchar(255) null
);

insert into shop_car.productlines values
('TX882', 'Good', ''),
('LJ449', 'Good', ''),
('AX110', 'Good', ''),
('LL445', 'Good', '')
;

-- -------------Employees-------------------
create table shop_car.employees(
employeeNumber int not null,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(100) not null,
jobTitle varchar(50) not null,
primary key (employeeNumber),
reportTo int not null,
foreign key (reportTo) references employees(employeeNumber),
officeCode varchar(10) not null,
foreign key (officeCode) references offices(officeCode)
);

insert into shop_car.employees values
(100, 'suo', 'Ya', 'yasuo@yahoo.com.vn', 'Boss', 100, 'OF(DN)'),
(101, 'sin', 'Le', 'lesin@yahoo.com.vn', 'Marketing', 101, 'OF(H)'),
(102, 'yi', 'Master', 'masteryi@yahoo.com.vn', 'Translate', 102, 'OF(CL)'),
(103, 'ker', 'Fa', 'faker@yahoo.com.vn', 'Ganh Team', 103, 'OF(HN)')
;

-- -----------OFFICES---------------------
create table shop_car.offices(
officeCode varchar(10) not null primary key,
city varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50) null,
state varchar(50) null,
country varchar(50) not null,
postalCode varchar(15) not null
);

insert into shop_car.offices values
('OF(DN)', 'Da Nang', '0236-777-989', '08 - Dong Da', 'None', 'None', 'VietNam', '+84'),
('OF(H)', 'Hue', '0231-435-222', '12 - Tran Quoc Toan', 'None', 'None', 'VietNam', '+84'),
('OF(CL)', 'Texas', '9988-774-882', '2/23 - Cenica', 'None', 'Califonia', 'America', '1+907'),
('OF(HN)', 'Ha Noi', '0273-554-288', '05 - Hai Ba Trung', 'None', 'None', 'VietNam', '+84')
;

-- ----------ORDERDETAILS-----------------------------------
create table shop_car.OrderDetails(
ordernumber int not null,
foreign key (ordernumber) references Orders(orderNumber), 
productcode varchar(15) not null,
foreign key (productcode) references Products(productCode)
);

insert into shop_car.OrderDetails values
(10, 'P01'),
(11, 'P02'),
(12, 'P03'),
(13, 'P04')
;



