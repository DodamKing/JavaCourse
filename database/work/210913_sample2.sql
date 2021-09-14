show databases;
show grants for atom2@localhost;

select database(); -- �쁽�옱 �꽑�깮�릺�뼱 �엳�뒗 �뜲�씠�꽣踰좎씠�뒪紐� 蹂댁뿬二쇨린
select user(); -- �쁽�옱 �궗�슜以묒씤 怨꾩젙 蹂댁뿬二쇨린

use sample2;

create table hoewon(
mid varchar(15) not null,
pwd varchar(15) not null,
name varchar(20) not null,
agt int default 20,
sex char(2) default '�궓�옄',
ipsail datetime default now(),
address varchar(50)
);

desc hoewon;

drop table hoewon;

alter table hoewon rename sinsang2;

select * from sinsang2;

desc sinsang2;

alter table sinsang2 change sex gender char(2) default '�뿬�옄';

alter table sinsang2 change agt age int default 20;

desc sinsang2;

insert into sinsang2 values('hong','1234','�솉湲몃룞',25,'�궓�옄','1990-10-05','�꽌�슱');
insert into sinsang2 values('kim','1234','源�留먯닕',33,'�뿬�옄','1997-12-3','遺��궛');
insert into sinsang2 values('lee','1234','�씠�닚�옄',24,'�뿬�옄','1985-7-25','愿묒＜');
insert into sinsang2 values('lee1','1234','�씠湲곗옄',40,'�궓�옄','1999-10-3','�슱�궛');
insert into sinsang2 values('park','1234','諛뺤갔�샇',32,'�궓�옄','1980-6-08','���쟾');
insert into sinsang2 values('bae','1234','諛곗��닕',19,'�뿬�옄','1993-11-22','留덉궛');
insert into sinsang2 values('son','1234','�넀湲곗젙',45,'�궓�옄','1987-12-15','�젣二�');
insert into sinsang2 values('kim1','1234','源��쁺�닕',36,'�뿬�옄','2002-10-5','遺�泥�');
insert into sinsang2 values('kim2','1234','源��쁺泥�',39,'�궓�옄','1988-10-05','�씤泥�');
insert into sinsang2 values('lee2','1234','�씠寃⑤씪',29,'�궓�옄','2000-10-09','�꽌�슱');
insert into sinsang2 values('son2','1234','�넀�삤怨�',23,'�궓�옄','2005-12-15','�꽌�슱');

select * from sinsang2;

delete from sinsang2;

select * from sinsang2 where mid='kim';

select * from sinsang2 where gender='�궓�옄';

select * from sinsang2 where address='�꽌�슱';

select * from sinsang2 where address='�꽌�슱' or address='�씤泥�';

select * from sinsang2 where address in ('�꽌�슱', '�씤泥�');

 select * from sinsang2 where address='�꽌�슱' and gender='�궓�옄';
 
 alter table sinsang2 add point int default 1000;
 
 desc sinsang2;
 
 select * from sinsang2;
 
 update sinsang2 set point=point+100 where gender='�뿬�옄';
 
 select * from sinsang2;
 
 update sinsang2 set point=point+50 where gender='�궓�옄' and ag>=35;
 
 select * from sinsang2;
 
 update sinsang2 set address='�꽌�슱' where mid='kim1';
 
 select* from sinsang2;
 
 select mid as �븘�씠�뵒, gender as �꽦蹂�, ipsail as �엯�궗�씪 from sinsang2;
 
 insert into sinsang2 (mid, pwd, name, age, gender, address) values ('park', '1234', '諛뺤꽭由�', 35, default, '�씤泥�');
 
 select * from sinsang2;
 
 select mid, age, gender, address from sinsang2 where age between 30 and 39;
 
 select * from sinsang2 where address!='�꽌�슱' and address!='�씤泥�' and gender='�뿬�옄';
 
 update sinsang2 set point=point+500 where address!='�꽌�슱' and address!='�씤泥�' and gender='�뿬�옄';
 
 select * from sinsang2 where gender='�뿬�옄';
 
 select * from sinsang2 where gender='�궓�옄' and ipsail<'1990-1-1';
 
 update sinsang2 set point=0 where gender='�궓�옄' and ipsail<'1990-1-1';
 
 select * from sinsang2;
 
 update sinsang2 set gender='�뿬�옄' where point=0 and age>=40;
 
 select * from sinsang2 where address='�꽌�슱';
 
 update sinsang2 set point=point+300 where address='�꽌�슱';
 
 update sinsang2 set pwd='0000' where address='�꽌�슱';
 
 select * from sinsang2;
 
 select * from sinsang2 where point=0 and gender='�궓�옄' and ipsail<'1985-1-1';
 
 delete from sinsang2 where point=0 and gender='�궓�옄' and ipsail<'1985-1-1';
 
 select * from sinsang2;
 
 insert into sinsang2 (mid, pwd, name, age, gender, address) values ('ddd', '1234', '디디디', 31, '남자', '청주');
 