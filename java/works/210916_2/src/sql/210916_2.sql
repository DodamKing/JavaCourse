create table user (
	idx int not null auto_increment primary key,
	mid varchar(20) not null,
	name varchar(20) not null,
	age int default 20,
	address varchar(30)
	);
	
desc user;

insert into user values (default, 'hkd1234', '홍길동', 25, '서울');
insert into user values (default, 'kms1234', '김말숙', 33, '부산');
insert into user values (default, 'lkj1234', '이기자', 30, '청주');

select * from user;