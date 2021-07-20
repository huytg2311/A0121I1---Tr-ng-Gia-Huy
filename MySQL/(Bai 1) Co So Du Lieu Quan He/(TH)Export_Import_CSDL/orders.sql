SELECT * FROM classicmodels.orders;

use classicmodels;

select *
from orders
where orderNumber between 10100 and 10110
limit 0, 30;

use classicmodels;

select *
from orders
where orderDate <= 2003-03-03
limit 0, 30;

select *
from orders 
where status like 'shipped'
limit 0, 30;