CREATE TABLE emp (
    id int, 
    `name` varchar(32), 
    sex char(4), 
    birthday date, 
    entry_date datetime, 
    job varchar(32), 
    Salary double, 
    resume text) charset utf8 collate utf8_bin engine INNODB;
insert into emp 
        values(100, "陈橙汁","man",'2000-11-11',
            '2022-11-10 10:10:10', 'play phone', 1000,
            'He always play mobile phone');
