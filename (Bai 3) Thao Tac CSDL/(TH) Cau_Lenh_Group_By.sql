USE shop_car;

SELECT status From orders
GROUP BY status;

-- COUNT --
SELECT status, COUNT(*) AS 'Amount (status)' From orders
GROUP BY status;

-- SUM --
select status, sum(quantityOrdered * priceEach) as amount
from orders 
inner join orderdetails on orders.ordernumber = orderdetails.ordernumber
group by status;

select orderNumber, sum(quantityOrdered * priceEach) as total
from orders
group by orderNumber;

-- HAVING --
SELECT YEAR(orderDate) AS year, SUM(quantityOrdered * priceEach) AS total
FROM orders
INNER JOIN orderdetails ON orders.orderNumber = orderdetails.orderNumber
WHERE status = 'normal'
group by year
HAVING year >= 2004
