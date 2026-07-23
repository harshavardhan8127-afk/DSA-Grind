# Write your MySQL query statement below
select d.name as Department,
       t.name as Employee,
       t.salary as Salary
from (select id,
             name,
             salary,
             departmentId,
             DENSE_RANK() OVER( PARTITION BY departmentId
            order by salary desc) as rk from employee) t
JOIN department d
ON t.departmentId = d.id
where t.rk <=3;
