use sample;

create table hoewon (mid varchar(15) not null, pwd varchar(15) not null, name varchar(20) not null, age int default 20, sex char(2) default '남자', ipsail datetime default now(), address varchar(50));

desc hoewon;

drop table hoewon;

alter table hoewon rename sinsang;

show tables;

alter table sinsang add content text;

desc sinsang;

alter table sinsang drop content;

desc sinsang;

alter table sinsang change sex gender char(2) default '여자';

desc sinsang;

insert into sinsang value ('hong','1234','홍길동',25,'남자','1990-10-05','서울');
insert into sinsang value('kim','1234','김말숙',33,'여자','1997-12-3','부산');
insert into sinsang value('lee','1234','이순자',24,'여자','1985-7-25','광주');
insert into sinsang value('lee1','1234','이기자',40,'남자','1999-10-3','울산');
insert into sinsang value('park','1234','박찬호',32,'남자','1980-6-08','대전');
insert into sinsang value('bae','1234','배은숙',19,'여자','1993-11-22','마산');
insert into sinsang value('son','1234','손기정',45,'남자','1987-12-15','제주');
insert into sinsang value('kim1','1234','김영숙',36,'여자','2002-10-5','부천');
insert into sinsang value('kim2','1234','김영철',39,'남자','1988-10-05','인천');
insert into sinsang value('lee2','1234','이겨라',29,'남자','2000-10-09','서울');
insert into sinsang value('son2','1234','손오공',23,'남자','2005-12-15','서울');


select * from sinsang;

delete from sinsang;

select * from sinsang where mid='kim';

select * from sinsang where gender='남자';

select * from sinsang where address='서울';

select * from sinsang where address='서울' or address='인천';

select * from sinsang where address='서울' or gender='남자';

alter table sinsang add point int default 1000;

desc sinsang;

select * from sinsang;

update sinsang set point=point+100 where gender='여자';

select * from sinsang;

update sinsang set point=point+50 where gender='남자' and age>=35;

select * from sinsang;

update sinsang set address='서울' where mid='kim';

select mid, age, address from sinsang;

select mid as 아이디, gender as 성별, ipsail as 입사일 from sinsang where ipsail>='2000-1-1';

insert into sinsang values ('park', 1234, '박세리', 35, '여자', default, '인천', default);

select mid, age, gender, address from sinsang where gender='여자' and age between 30 and 39;

select * from sinsang;

update sinsang set point=point+500 where gender='여자' and address!='서울' and address!='인천';

update sinsang set point=0 where gender='남자' and ipsail<'1990-1-1';

update sinsang set gender='여자' where point=0 and age>=40;

update sinsang set pwd='0000', point=point+300 where address='서울';

delete from sinsang where point=0 and gender='남자' and ipsail<'1985-1-1';

select * from sinsang;

drop table sinsang;

show tables;

create table sinsang (mid varchar(15) not null, pwd varchar(15) not null, name varchar(20) not null, age int default 20, sex char(2) default '남자', ipsail datetime default now(), address varchar(50));

insert into sinsang value ('hong','1234','홍길동',25,'남자','1990-10-05','서울');
insert into sinsang value('kim','1234','김말숙',33,'여자','1997-12-3','부산');
insert into sinsang value('lee','1234','이순자',24,'여자','1985-7-25','광주');
insert into sinsang value('lee1','1234','이기자',40,'남자','1999-10-3','울산');
insert into sinsang value('park','1234','박찬호',32,'남자','1980-6-08','대전');
insert into sinsang value('bae','1234','배은숙',19,'여자','1993-11-22','마산');
insert into sinsang value('son','1234','손기정',45,'남자','1987-12-15','제주');
insert into sinsang value('kim1','1234','김영숙',36,'여자','2002-10-5','부천');
insert into sinsang value('kim2','1234','김영철',39,'남자','1988-10-05','인천');
insert into sinsang value('lee2','1234','이겨라',29,'남자','2000-10-09','서울');
insert into sinsang value('son2','1234','손오공',23,'남자','2005-12-15','서울');

alter table sinsang change sex gender char(2) default '여자';

alter table sinsang add point int default 1000;

update sinsang set point=point+100 where gender='여자';

update sinsang set point=point+50 where gender='남자' and age>=35;

update sinsang set address='서울' where mid='kim1';

insert into sinsang values ('park', 1234, '박세리', 35, '여자', default, '인천', default);

update sinsang set point=point+500 where gender='여자' and address!='서울' and address!='인천';

update sinsang set point=0 where gender='남자' and ipsail<'1990-1-1';

update sinsang set gender='여자' where point=0 and age>=40;

update sinsang set pwd='0000', point=point+300 where address='서울';

delete from sinsang where point=0 and gender='남자' and ipsail<'1985-1-1';

select * from sinsang;

