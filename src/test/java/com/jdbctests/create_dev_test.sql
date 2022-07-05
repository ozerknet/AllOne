create table Developers(
Id_Number Integer primary key,
Names varchar(30),
Salary Integer
);
create table Testers(
Id_Number Integer primary key,
Names varchar(30),
Salary Integer
);
 
insert into developers values (1, 'Mike', 155000);
insert into developers values (2, 'John', 142000);
insert into developers values (3, 'Steven', 850000);
insert into developers values (4, 'Maria', 185000);
insert into testers values (1, 'Steven', 110000);
insert into testers values(2, 'Adam', 105000);
insert into testers values (3, 'Lex', 100000);

commit work;

select * from testers
union all
select * from developers;


select names from developers
minus
select names from testers;

select first_name, count(*)
from employees
group by first_name
having count(*)>1;






