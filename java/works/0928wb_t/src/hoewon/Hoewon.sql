show tables;

desc hoewon;

create table hoewon2 (
	idx	 int not null auto_increment,	/* 고유번호 */
	name varchar(20) not null,			/* 회원명 */
	age  int default 20,				/* 나이 */
	address varchar(50) not null,		/* 주소 */
	primary key(idx)
);

desc hoewon2;

insert into hoewon2 values (default,'홍길동',23,'서울');
insert into hoewon2 values (default,'김말숙',32,'부산');
insert into hoewon2 values (default,'이기자',41,'청주');
insert into hoewon2 values (default,'오하늘',37,'인천');
insert into hoewon2 values (default,'강감찬',29,'제주');

delete from hoewon2 where idx=7;

select * from hoewon2 order by idx desc;
