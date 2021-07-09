USE shop_car;

-- Buoc 1 -------
SELECT customers.customerNumber, customername, phone, paymentDate, amount
FROM customers
INNER JOIN payments
ON customers.customerNumber = payments.customerNumber
WHERE city = 'Japan';

-- Buoc 2 -------
SELECT customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
FROM customers
LEFT JOIN orders
ON customers.customerNumber = orders.customerNumber;

-- If USE (INNER JOIN), you only see customerlist don't have orderNumber is null -----
SELECT customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
FROM customers
LEFT JOIN orders
ON customers.customerNumber = orders.customerNumber
WHERE orderNumber = 'null';