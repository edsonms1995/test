drop database if exists question7;
create database if not exists question7;
use question7;

CREATE TABLE dogs (
	id int not null,
	name varchar(50),
    primary key (id)
);

CREATE TABLE cats (
	id int not null,
	name varchar(50),
    primary key (id)
);

INSERT INTO dogs VALUES 
	(1, "Toddy"),
	(2, "Toy"),
	(3, "Nick"),
    (4, "Toy");
    
INSERT INTO cats VALUES 
	(1, "Pantera"),
	(2, "Toddy"),
	(3, "Milka");

select distinct name from dogs
union 
select distinct name from cats
order by name
