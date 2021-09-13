--범위 실행 알트 x
--한줄 실행 알트 s

show tables;

select * from sinsang2;

--군(집합)
--남자/여자 군(집합)에 대하여 대표자료 1건씩만 출력
select distinct gender from sinsang2;
select distinct gender as 성별, name as 성명 from sinsang2;
select distinct address as 주소 from sinsang2;

desc sinsang2;
insert into sinsang2 values('snm', '1234', '소나무', 22, '남자', default, '청주', 1000);
select *from sinsang2;



--sql 함수
select user();
select database();

--개수
select count(address) from sinsang2;
select count(*) from sinsang2; 
select count(distinct address) from sinsang2;

select count(distinct address) as '주소 개수' from sinsang2 where gender='남자';

-- 집합(군) : group by ~ having
select address from sinsang2;
select distinct address from sinsang2;
select address from sinsang2 group by address;
select address as 주소, count(address) from sinsang2 group by address;
select gender as 성별, count(gender) as 수 from sinsang2 group by gender;

select gender, count(gender) from sinsang2 where gender='남자';
select gender, count(gender) from sinsang2 where gender='여자' group by gender;

select address, count(address) from sinsang2 group by address;
select address, gender, count(address) from sinsang2 where gender='남자' group by address;
select address, gender, count(address) from sinsang2 where gender='남자' group by address having count(address)>=2;

-- 합계 계산 sum()
select address, count(*) as '서울에 거주하는 사람' from sinsang2 where address ='서울';
select sum(point)  as '서울 지역 포인트 합' from sinsang2 where address='서울';
select sum(point) as '30이상 여자 포인트 합' from sinsang2 where gender='여자' and age>=30;


-- 평균 avg()
select avg(point) as '30이상 여자 포인트 평균' from sinsang2 where gender='여자' and age>=30;
select avg(point) from sinsang2 where gender='남자';

select * from sinsang2;
select * from sinsang2 where gender='남자';

update sinsang2 set point=point+500 where address='서울';
update sinsang2 set point=point+500 where age>=30;

select max(point) from sinsang2;
select max(point) from sinsang2 where gender='남자';
select min(point) from sinsang2 where gender='남자';
select max(point) from sinsang2 where gender='여자';
select min(point) from sinsang2 where gender='여자';

select gender as 성별, avg(point) as 평균 from sinsang2 group by gender;


-- 수학
-- round 실수 반올림
select gender as 성별, round(avg(point), 2) as 평균 from sinsang2 group by gender;
select gender as 성별, round(avg(point), -1) as 평균 from sinsang2 group by gender;

-- truncate(수, 자리수) 실수 내림
select gender as 성별, truncate(avg(point), 2) as 평균 from sinsang2 group by gender;
select gender as 성별, truncate(avg(point), -1) as 평균 from sinsang2 group by gender; 

select truncate(avg(age),0) from sinsang2;

-- ceil 정수올림
select gender as 성별, ceil(avg(point)) as 평균 from sinsang2 group by gender;

-- floor 정수내림
select gender as 성별, floor(avg(point)) as 평균 from sinsang2 group by gender;
select gender, floor(avg(age)) from sinsang2 group by gender;

-- abs 절대값
select abs(-500); /* 주석 잘 되는데 왜 */
select abs((avg(age) group by gender='여자') - (avg(age) group by gender='남자')); /* 안되는듯 */

-- mod 나머지
select floor(10/3) as 몫, mod(10,3) as 나머지;

-- power(수1, 수2) 지수
select power(2, 5) as '2^5';

-- 문자 함수
-- 문자의 길이
select length('seoul');
select length('Seoul');
--select length('Seoul\'s');
select length('서울');
select length('서울의 봄'); /* 공백의 길이는 1 */

-- 대소문자 전환
select upper('seoul');
select lower('SEOUL');

-- concat(문자열1, 문자열2)
select concat(name, '의 나이는 ', age, '살 입니다.') from sinsang2;





