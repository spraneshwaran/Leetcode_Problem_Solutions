select unique_id ,name 
from Employees Left join EmployeeUNI 
on Employees.id = EmployeeUNI.id