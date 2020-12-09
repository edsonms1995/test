drop database if exists question4;
create database if not exists question4;
use question4;

CREATE TABLE students (
	id int,
	name varchar(50),
    value int,
    primary key (id)
);

CREATE TABLE grades (
	grade int,
	min_value int,
    max_value int
);

INSERT INTO students VALUES 
	(1, "Julia", 88),
	(2, "Carol", 68),
	(3, "Maria", 99),
	(4, "Andreia", 78),
	(5, "Jaqueline", 63),
	(6, "Marcela", 81);

INSERT INTO grades VALUES 
	(1, 0, 9),
	(2, 10, 19),
	(3, 20, 29),
	(4, 30, 39),
	(5, 40, 49),
	(6, 50, 59),
	(7, 60, 69),
	(8, 70, 79),
	(9, 80, 89),
	(10 ,90, 100);
    
(
	select s.name, g.grade, s.value from students s
	inner join grades g on s.value >= g.min_value and s.value <= g.max_value
	where grade >= 8
	-- order by g.grade desc, s.name desc
)
union
(
	select NULL as name, g.grade, s.value from students s
	inner join grades g on s.value >= g.min_value and s.value <= g.max_value
    where grade <= 7
    -- order by s.value
)
order by grade desc, name desc, value asc;
    