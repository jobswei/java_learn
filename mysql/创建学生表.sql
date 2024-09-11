create table student(
       id int not null default 1,
       name varchar(20) not null default '',
       chinese float not null default 0.0,
       english float not null default 0.0,
       math float not null default 0.0
);

insert into student values(1,'韩顺平',89, 78, 90); 
insert into student values(2,'张飞' , 67, 98, 56);
insert into student values(3, '宋江',87, 78, 77);
insert into student values(4,'关羽',88, 98, 90);
insert into student values(5,'赵云', 82, 84, 67);
insert into student values(6,'欧阳',55, 85, 45);
insert into student values(7,'黄蓉',75,65, 30);