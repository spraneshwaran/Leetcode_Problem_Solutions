Select p.product_id,
Coalesce( Round ( SUM(u.units*p.price)/Sum(u.units), 2 ), 0)
as average_price
from Prices p left join UnitsSold u 
on p.Product_id=u.Product_id and (purchase_date Between start_date and end_date)
group by p.product_id;
