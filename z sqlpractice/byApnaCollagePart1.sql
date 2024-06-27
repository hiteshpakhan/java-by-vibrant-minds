CREATE DATABASE collage;

use collage;

create table student (id int primary key, name varchar(50), age int not null);

insert into student values(1, "aman", 26);
insert into student values(2, "aman1", 24);
insert into student values(3, "aman2", 25);

-- also you can add data like this
insert into student values(4, "aman3", 26),
(5, "aman4", 24),
(6, "aman5", 25);

select * from student;

-- also you can show table like this
select * from collage.student;


-- #databases related queries:
-- if not exists command
create database if not exists collage;

-- if exists command
drop database if exists sndkvfjbsdknf;

show databases;

show tables;

-- # table relates quaries
-- create table tname(name data_type);

--  select  - dql command
-- select * from table_name;

-- insert
-- insert into table_name (column_name1, column_name2) values (value1, value2),(value1, value2),(value1, value2);
insert into student (id,name,age) values (7, "asdf",23),(8, "asdfasd",3),(9, "sdfsasdf",43);

-- Constraints
-- NOT NULL -  columns cannot have a null value
-- UNIQUE	-  all values in column are different
-- PRIMARY KEY - makes a column unique & not null but used only for one
-- FOREIGN KEY - prevent actions that would destroy links between tables
-- DEFAULT 	   - sets the default value of a column
-- CHECK 	   - it can limit the values allowed in a column



-- # there are 3 methods to define primary key 
	-- first
	create table sample1(id int primary key);

	-- second if you have so much data and you want ot define primary key at the end then you can use this syntax
	create table sample2(id int, age int, name varchar(50), city varchar(20), primary key(id));
	-- here as you can see we have made the id primary key

	-- third
	-- imp - you can also make combine primary key just we did privousely we can just add the another column into primary key
	create table sample3(id int, age int, name varchar(50), city varchar(20), primary key(id, age));
	-- here we have add one more key age to the primary key means now id and age are both are the primary key
	-- also this means may be oine of the column may have the duplicate value but the combination of both of them will not be the same 

-- foreign key
	-- for now just we will see the syntax
	create table sample4(cost_id int, foreign key (cost_id) references sample3(id));
    -- we first declared one column named cost_id as int then we made that cost_id a foreign key then we gave reference of the primary key of sample3 tables id column 
    
-- default
	-- syntax:
    create table sample5(id int, salary int default 25000);
    
-- check
	-- syntax
    create table sample6(id int, city varchar(50), age int, constraint age_check check (age >= 18 and city="delhi"));
    insert into sample6 (id, city, age) values (2, "delhi", 19);	-- will run
    insert into sample6 (id, city, age) values (3, "amravati", 17);	-- will not run

-- ----------------------------------------------------------------------

-- now here we will create sample database that we can perform some operations
CREATE DATABASE univercity;
USE univercity;

-- sample data
CREATE TABLE student (rollno INT PRIMARY KEY,name VARCHAR(50),marks INT NOT NULL,grade VARCHAR(1), city VARCHAR(20));

INSERT INTO student (rollno, name, marks, grade, city) values (101, "anil", 78, "c", "Pune"),(102, "bhumika", 93, "a", "mumbai"),(103, "chetan", 85, "b", "mumbai"),(104, "dhruv", 96, "a", "delhi"),(105, "emanuel", 12, "f", "delhi"),(106,"farah", 82, "b", "delhi");

-- select statement syntax
    SELECT name, marks FROM student;  -- only columns like name and marks will be shown
    SELECT * FROM student;
    SELECT DISTINCT city FROM student; -- it will give you all the cities without repetating cities only the cities that are unique like here we got the output as : pune, mumbai, delhi
    
-- # clause 
-- WHERE clause
    SELECT * FROM student WHERE marks > 80;
    SELECT * FROM student WHERE city = "mumbai";

-- AND
    SELECT * FROM student WHERE marks > 80 AND city = "mumbai";
    
-- using operators in sql
    -- arithmatic operators + - * / %, comparison operators = != > >= < <=, logical operators AND OR NOT IN BETWEEN ALL LIKE ANY, bitwise operators & |

-- arithmatic operator    
SELECT * FROM student WHERE marks+10 > 100;

-- comparision operator
SELECT * FROM student WHERE marks > 90;

-- Logical operator
SELECT * FROM student WHERE marks > 90 AND city = "mumbai";

SELECT * FROM student WHERE marks BETWEEN 80 AND 90;

SELECT * FROM student WHERE city IN ("delhi", "mumbai");

SELECT * FROM student WHERE city NOT IN ("delhi", "mumbai");



