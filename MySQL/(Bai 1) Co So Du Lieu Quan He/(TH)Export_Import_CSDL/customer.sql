SELECT * FROM classicmodels.customers;

use classicmodels;

select *
from customers
where customerName = 'Atelier Graphique'
limit 0, 30;

	select *
	from customers
	where customerName like '%A%'
	limit 0, 30;

use classicmodels;

select *
from customers
where city
in(
'Nantes','Las Vegas','Warszama','NYC'
)
limit 0,30;


