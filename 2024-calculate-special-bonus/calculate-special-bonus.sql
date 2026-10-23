select employee_id,
CASE 
    WHEN (employee_id % 2 = 0 OR name LIKE 'M%')
    THEN 0
    ELSE salary
END AS bonus
from Employees
order by employee_id;