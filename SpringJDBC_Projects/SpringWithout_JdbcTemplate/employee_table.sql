use Spring_JDBC_schema;

create table employee_table(
employee_id int(11) not null auto_increment,
employee_name varchar(45) not null,
salary double default null,
email varchar(45) default null,
gender varchar(10) default null,
primary key(employee_id)
);

select * from employee_table;