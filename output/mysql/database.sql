#演示数据库的操作
create database db01;
create database if not exits db02 character_set utf8 collate utf8_bin;
#创建数据库的时候，为了规避关键字，可以使用反引号
create database ` create`
#校对规则
#utf8_bin: 区分大小写
# utf8_general_ci: 不区分大小写

#删除数据库
DROP DATABASE [if exits] db01;

# 显示数据库
show databases ;
show create database db01;

select * from t1 where name = 'tom';

# 备份数据库(dos)
mysqldump -u root -p -B dataset1 dataset2 > file.sql;
# 恢复数据库(mysql)
Sourse file.sql

# 备份数据库的表
mysqldump -u root -p dataset1 table1 table2 > file.sql;

# 创建表
CREATE TABLE table_name (id int, name varchar, .... ) character_set utf8 collate utf8_bin engine xxx;
# 日期类型
create table t2 (
    birthday DATE , --生日
    job_time datetime,  -- 年月日 时分秒
    login_time timestamp not null default current_timestamp on update current_timestamp);-- 登陆时间，自动更新

insert into t2(birthday,job_time) values('2022-11-11','2022-11-11 10:10:10');
-- 如果我们更新了t2的某条记录。login_time会自动以当前时间进行更新

# 添加列
alter table tablename 
add     (column datatype, )
[after column_name];
# 修改列
alter table tablename 
modify  (column datatype, );
# 删除列
alter table table_name
drop    (column);
# 查看表结构
desc table_name

rename table name1 to name2;
alter table table_name character set utf8;

alter table emp 
        add image varchar(32) not null default '' 
        after resume; -- 在resume字段后面  

# CRUD
insert into tablename (column)
values (values);

update table_name
   set column_name=value
 where condition; -- 如果没有where会修改所有的记录

update employ
    set Salary=Salary+100 -- 薪水增加1000
    where `name`='xxx';

delete from table_name 
 where condition;
-- 不能删除某一个列的值，可以使用updata置空(null或'')

# 查询表
select [distinct] * | (column1,column2...)
  from table_name
 where condition

select `name`,english from student union `name`,job from employ;
select `name` as fuck from student;
select `name`,(chinese+english+math) as total_score from student;
select `name`,english from student where (english+chinese)>150;
select `name`,english from student where english>chinese;
select `name`,english from student where english between 70 and 80;
select `name`,math from student where math in (85,90);
-- 模糊查询
select `name`,english from student where `name` like '韩%';
-- 多个条件
select `name`,english from student where (chinese+english+math) and chinese<math;
-- order by
select ... from table_name order by column1 asc|desc --默认asc升序
select `name`,math from student order by math asc;

-- 合计函数count
select count(*)|column1 from table_name
select count(*) from student;
select count(*) from student where math>90;

-- sum 计算行和
select sum(math) from student;
select sum(math) as math, sum(english) as english, sum(chinese) as chinese from student ;
select sum(math + english + chinese) as `ALL` from student;
select sum(chinese)/count(chinese) as aver_chin from student;
-- avg 求平均
select avg(math) from student;
-- max/min 极值

-- group by
select avg(math), max(math) from student group by english;
select avg(math), max(math) from student group by english,chinese;
select avg(math), max(math) from student group by english having english>80;

