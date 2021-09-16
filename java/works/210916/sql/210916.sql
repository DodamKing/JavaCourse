show tables;

create table user (
	idx int not null auto_increment primary key,
	mid varchar(20) not null,
	name varchar(20) not null,
	age int default 20,
	address varchar(30)
	);
	
desc user;

insert into user values (default, 'hkd1234', 'Honggildong', 25, 'seoul');
insert into user values (default, 'kms1234', 'Kimmalsuk', 33, 'busan');
insert into user values (default, 'lkj1234', 'Leekija', 30, 'cheongju');

select * from user;
