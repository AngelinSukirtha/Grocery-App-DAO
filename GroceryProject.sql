show databases;
create database g_app_project;
use g_app_project;
create table groceryappproject(
userName varchar(50),
password varchar(50),
phoneNo varchar(10),
mailId varchar(50),
-- userName1 varchar(50),
-- password1 varchar(50),
-- phoneNo1 varchar(10),
-- mailId1 varchar(50));
-- insert into groceryappproject (username, password, phoneNo) values ('Angelin','123','9876543212');
drop database g_app_project;
select * from groceryappproject;
alter table groceryappproject add userName1 varchar(50);
alter table groceryappproject add password1 varchar(50);
alter table groceryappproject add phoneNo1 varchar(10);
alter table groceryappproject add mailId1 varchar(50);