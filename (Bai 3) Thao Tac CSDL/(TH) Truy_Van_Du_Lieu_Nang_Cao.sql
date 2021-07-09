USE shop_car;

-- USE (AND) ----
SElECT productCode, productName, buyPrice, quanityInStock
FROM products
WHERE buyPrice = 10 AND quanityInStock > 20;

-- USE (INNER JOIN) ----
SELECT productCode, productName, buyPrice, textDescription
FROM products
INNER JOIN productlines
ON products.productLine = productlines.productLine
WHERE buyPrice > 4 AND buyPrice < 10;

-- USE (OR) ----
SELECT productCode, productName, buyPrice, quanityInStock, productVendor, productLine
FROM products
WHERE productLine = 'TX882' OR productVendor = 'Viet Nam';