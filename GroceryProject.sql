show databases;
create database g_app_project;
use g_app_project;
create table groceryappproject(
userName varchar(50),
password varchar(50),
phoneNo varchar(10),
mailId varchar(50));
select * from groceryappproject;
alter table groceryappproject add userName1 varchar(50);
alter table groceryappproject add password1 varchar(50);
alter table groceryappproject add phoneNo1 varchar(10);
alter table groceryappproject add mailId1 varchar(50);
create table businesslogic(
price int,
sgst int,
cgst int,
totalAmount int);
select * from businesslogic;
-- drop database g_app_project;
create table adminSide(
userName1 varchar(50),
password1 varchar(50)
);
insert into adminSide(userName1,password1)values ('Angelin','Angel#18');
insert into adminSide(userName1,password1)values ('Sukirtha','Suki@12');
select * from adminSide;