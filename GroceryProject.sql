show databases;
create database g_app_project;
use g_app_project;
create table groceryappproject(
userName varchar(50),
password varchar(50),
phoneNo varchar(10),
mailId varchar(50));
select * from groceryappproject;
insert into groceryappproject(userName,password,phoneNo,mailId)values ('Abirami','Abi#15','1234567890','abi15@gmail.com');
insert into groceryappproject(userName,password,phoneNo,mailId)values ('Ashlyn','Ash@03','9876543210','ash03@gmail.com');
insert into groceryappproject(userName,password,phoneNo,mailId)values ('Kayal','Kayal$17','6789054321','kayal17@gmail.com');
insert into groceryappproject(userName,password,phoneNo,mailId)values ('Vidhya','Vidhu@09','7890654321','vidhu09@gmail.com');
insert into groceryappproject(userName,password,phoneNo,mailId)values ('Ram','ram#34','2345678901','ram34@gmail.com');
insert into groceryappproject(userName,password,phoneNo,mailId)values ('Anitha','Anitha@67','7890654321','anitha67@gmail.com');
insert into groceryappproject(userName,password,phoneNo,mailId)values ('Rakshana','Raksh#89','9087654321','rakshana89@gmail.com');
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
alter table businesslogic add ratings int;
-- drop database g_app_project;
create table adminSide(
userName1 varchar(50),
password1 varchar(50)
);
insert into adminSide(userName1,password1)values ('Angelin','Angel#18');
insert into adminSide(userName1,password1)values ('Sukirtha','Suki@12');
select * from adminSide;

create table adminManagement(
fruits varchar(25),
vegetables varchar(25),
nuts varchar(25),
stationery varchar(25),
drinks varchar(25),
grains varchar(25));
insert into adminManagement(fruits,vegetables,nuts,stationery,drinks,grains) values ('Apple','Potato','Almonds','Notebooks','Coca-Cola','Wheat');
insert into adminManagement(fruits,vegetables,nuts,stationery,drinks,grains) values ('Orange','Tomato','Walnuts','Diaries','Pepsi','Oats');
insert into adminManagement(fruits,vegetables,nuts,stationery,drinks,grains) values ('Grapes','Onion','Pecans','Pen','Limca','Rice');
insert into adminManagement(fruits,vegetables,nuts,stationery,drinks,grains) values ('Banana','Carrot','Cashews','Pencils','Sprite','Corn');
insert into adminManagement(fruits,vegetables,nuts,stationery,drinks,grains) values ('Watermelon','Beetroot','Hazelnuts','Calculator','Fanta','Barley');
insert into adminManagement(fruits,vegetables,nuts,stationery,drinks,grains) values ('PineApple','Broccoli','Peanuts','PunchingMachine','AppyFizz','Sorghum');
select * from adminManagement;
drop table adminManagement;