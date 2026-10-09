SELECT s.name FROM SalesPerson s
WHERE sales_id NOT IN(
    SELECT o.sales_id FROM Orders o
    JOIN Company c ON o.com_id=c.com_id
    WHERE c.name ='Red'
)