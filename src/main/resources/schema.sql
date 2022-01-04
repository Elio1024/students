drop table if exists classes;
create table classes(
                        c_id int primary key auto_increment,
                        c_number varchar(20),
                        c_name varchar(20),
                        c_state enum('0','1'),
                        c_creator varchar(20),
                        c_creation datetime,
                        c_operator varchar(20),
                        c_operation datetime
);
drop table if exists student;
create table student(
                        s_id int primary key auto_increment,
                        s_number varchar(20),
                        s_name varchar(20),
                        sex enum('F','M'),
                        birthday date,
                        address varchar(100),
                        phone varchar(20),
                        c_id int,
                        s_state enum('0','1'),
                        s_creator varchar(20),
                        s_creation datetime,
                        s_operator varchar(20),
                        s_operation datetime
);
drop table if exists score;
create table score(
                      sc_id int primary key auto_increment,
                      chinese int,
                      math int,
                      english int,
                      s_id int
);