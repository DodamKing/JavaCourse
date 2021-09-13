show databases;
show grants for atom2@localhost;

select database(); -- 현재 선택되어 있는 데이터베이스명 보여주기
select user(); -- 현재 사용중인 계정 보여주기

use sample2;

create table hoewon(
mid varchar(15) not null,
pwd varchar(15) not null,
name varchar(20) not null,
agt int default 20,
sex char(2) default '남자',
ipsail datetime default now(),
address varchar(50)
);

desc hoewon;

drop table hoewon;

alter table hoewon rename sinsang2;

select * from sinsang2;

desc sinsang2;

alter table sinsang2 change sex gender char(2) default '여자';

alter table sinsang2 change agt age int default 20;

desc sinsang2;

insert into sinsang2 values('hong','1234','홍길동',25,'남자','1990-10-05','서울');
insert into sinsang2 values('kim','1234','김말숙',33,'여자','1997-12-3','부산');
insert into sinsang2 values('lee','1234','이순자',24,'여자','1985-7-25','광주');
insert into sinsang2 values('lee1','1234','이기자',40,'남자','1999-10-3','울산');
insert into sinsang2 values('park','1234','박찬호',32,'남자','1980-6-08','대전');
insert into sinsang2 values('bae','1234','배은숙',19,'여자','1993-11-22','마산');
insert into sinsang2 values('son','1234','손기정',45,'남자','1987-12-15','제주');
insert into sinsang2 values('kim1','1234','김영숙',36,'여자','2002-10-5','부천');
insert into sinsang2 values('kim2','1234','김영철',39,'남자','1988-10-05','인천');
insert into sinsang2 values('lee2','1234','이겨라',29,'남자','2000-10-09','서울');
insert into sinsang2 values('son2','1234','손오공',23,'남자','2005-12-15','서울');

select * from sinsang2;

delete from sinsang2;

select * from sinsang2 where mid='kim';

select * from sinsang2 where gender='남자';

select * from sinsang2 where address='서울';

select * from sinsang2 where address='서울' or address='인천';

select * from sinsang2 where address in ('서울', '인천');

 select * from sinsang2 where address='서울' and gender='남자';
 
 alter table sinsang2 add point int default 1000;
 
 desc sinsang2;
 
 select * from sinsang2;
 
 update sinsang2 set point=point+100 where gender='여자';
 
 select * from sinsang2;
 
 update sinsang2 set point=point+50 where gender='남자' and ag>=35;
 
 select * from sinsang2;
 
 update sinsang2 set address='서울' where mid='kim1';
 
 select* from sinsang2;
 
 select mid as 아이디, gender as 성별, ipsail as 입사일 from sinsang2;
 
 insert into sinsang2 (mid, pwd, name, age, gender, address) values ('park', '1234', '박세리', 35, default, '인천');
 
 select * from sinsang2;
 
 select mid, age, gender, address from sinsang2 where age between 30 and 39;
 
 select * from sinsang2 where address!='서울' and address!='인천' and gender='여자';
 
 update sinsang2 set point=point+500 where address!='서울' and address!='인천' and gender='여자';
 
 select * from sinsang2 where gender='여자';
 
 select * from sinsang2 where gender='남자' and ipsail<'1990-1-1';
 
 update sinsang2 set point=0 where gender='남자' and ipsail<'1990-1-1';
 
 select * from sinsang2;
 
 update sinsang2 set gender='여자' where point=0 and age>=40;
 
 select * from sinsang2 where address='서울';
 
 update sinsang2 set point=point+300 where address='서울';
 
 update sinsang2 set pwd='0000' where address='서울';
 
 select * from sinsang2;
 
 select * from sinsang2 where point=0 and gender='남자' and ipsail<'1985-1-1';
 
 delete from sinsang2 where point=0 and gender='남자' and ipsail<'1985-1-1';
 
 select * from sinsang2;