-- Bước 1: ---------------------------------
create database baitap5;
use baitap5;


-- Bước 2: -------------------------------
-- table
create table Products(
Id int,
productCode varchar(20),
productName varchar(20),
productPrice double,
productAmount int,
productDescription varchar(20),
productStatus varchar(20)
);

insert into Products values
(01, 'al001', 'IPhone 13', 23.000, 15, 'Real', 'Has'),
(02, 'al002', 'SamSung Note 10', 16.000, 6, 'Real', 'Has'),
(03, 'al003', 'Oppo X', 10.000, 2, 'Real', 'Has'),
(04, 'al004', 'Nokia 10', 7.000, 5, 'Real', 'Has'),
(05, 'al005', 'Lenovo', 5.000, 9, 'Real', 'Has');

-- Bước 3: ----------------------------------------
-- unique index
create unique index uidx_pc
on products (productCode);

-- composite index
create index idx
on products (productName, productPrice);

-- explain
explain select *
from products
where productCode = 'al004' or productName = 'Iphone 13';

-- Câu truy vấn sau khi tạo index sẽ thực thi nhanh hơn so với trước khi đó. 
-- Nhưng vì bảng chứa quá ít thông tin dữ liệu nên trường hợp này nó chạy sẽ như nhau.

-- Bước 4: ------------------------------------------
-- Tạo View
create view v_pr as
select productCode, productName, productPrice, productStatus 
from Products;

select * from v_pr;

-- Sửa đổi view 
create or replace view view_Product as
select productCode, productName, productPrice, productStatus
from products;

select * from view_Product;

-- xóa view
drop view view_Product;

-- Bước 5: -----------------------------
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure selectAllProducts()
begin
select * from products;
end //
delimiter ;

call selectAllProducts();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure newproduct( 
in product_Code varchar(20),
in product_Name varchar(20),
in product_Price double,
in product_Amount int,
in product_Description varchar(20),
in product_Status varchar(20))
begin
set I_d = 06;
set product_Code = 'al006';
set product_Name = 'Laptop Dell';
set product_Price = 25000000;
set product_Amount = 5;
set product_Description = 'Has';
set product_Status = 'Has'; 
end; //
delimiter ;

call newproduct(@I_d, @product_Code, @product_Name, @product_Price,
@product_Amount, @product_Description, @product_Status);
select @I_d, @product_Code, @product_Name, @product_Price,
@product_Amount, @product_Description, @product_Status;

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure edit_product (
in I_d int, 
in product_Code varchar(20), 
in product_Name varchar(20), 
in product_Price double,
in product_Amount int, 
product_Description varchar(20), 
product_Status varchar(20))
begin 
update products
set
productCode = product_Code, productName = product_Name,  
productPrice = product_Price, productAmount = product_Amount,
productDescription = product_Description, productStatus = product_Status
where Id = I_d;
end; //
delimiter ;

delimiter ; //
call edit_product(02, 'ah002', 'Oppo Reno 7', 9.000, 20, 'fivestar', 'New');
select * from products;

-- Xóa procedure
drop procedure newproduct;
 



