use classicmodels;

create view customer_view AS
select customerNumber, customerName, phone
from  customers;

select * from customer_view;

-- cap nhat view
create or replace view view_name AS
select customerNumber, customerName, contactFirstName, contactLastName, phone
from customers
where city = 'Nantes';

select * from view_name;

-- xoa view 
drop view view_name;