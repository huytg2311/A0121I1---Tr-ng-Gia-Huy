use classicmodels;

DELIMITER //

CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM customers;

END //

DELIMITER ;

call findAllCustomers();

DELIMITER //

DROP procedure if exists `findAllCustomers`//

create procedure findALLCustomers()

begin

select * from customers where customerNumber = 175;

end; //

DELIMITER ;