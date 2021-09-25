create table hoewon (
	idx int not null auto_increment primary key,
	mid varchar(20) not null,
	pwd varchar(20) not null,
	name varchar(20) not null,
	age int default 20,
	address varchar(30),
	point int default 100
	);

drop table hoewon;

desc hoewon;

insert into hoewon values (default, 'hkd1234', '1234', '홍길동', default, '서울', default);

select * from hoewon;

