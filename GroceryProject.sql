show databases;
create database g_app_project;
use g_app_project;
create table groceryappproject(
userName varchar(50),
password varchar(50),
phoneNo varchar(10));
insert into groceryappproject (username, password, phoneNo) values ('Angelin','123','9876543212');
drop database g_app_project;
select * from groceryappproject;
alter table groceryappproject add price int;
alter table groceryappproject add sgst int;
alter table groceryappproject add cgst int;
alter table groceryappproject add totalamount int;