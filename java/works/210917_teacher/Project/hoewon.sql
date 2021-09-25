create table hoewon (
	idx  int not null auto_increment primary key,	/* 고유번호 */
	mid  varchar(20) not null,						/* 회원 ID */
	pwd  varchar(20) not null,						/* 비밀번호 */
	name varchar(20) not null,						/* 회원 성명 */
	age	 int default 20,							/* 나이(기본값: 20) */
	address varchar(30),							/* 주소 */
	point int default 100							/* 포인트(가입시 100포인트 지급) */
);
drop table hoewon;
desc hoewon;

insert into hoewon values (default,'hkd1234','1234','홍길동',default,'서울',default);

select * from hoewon;

select * from hoewon where mid='hkd1234';
