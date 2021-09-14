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
select gender as 성별, floor(avg(point)) as 평균 from sinsang2 group by gender; /* 주석이 왜 안 먹지*/
select gender, floor(avg(age)) from sinsang2 group by gender; /* 잘 먹네 */

-- abs 절대값
select abs(-500); /* 주석 잘 되는데 왜 */
select abs((avg(age) group by gender='여자') - (avg(age) group by gender='남자'));  /* 안되는듯 */

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

-- 문자열 반환: substr(string, position, len)
select substr('Welcome to Korea', 3, 7); /* 시작 위치가 0이 아니네 */
select substr('안녕 세상', 2, 3);
select substr('951225-1234567', 8, 1) as 성별번호;
select substr('951225-1234567', 1, 6) as 생년월일;
select concat(substr('951225-1234567', 1, 2), '년 ', substr('951225-1234567', 3, 2), '월 ', substr('951225-1234567', 5, 2), '일') as 생년월일;

-- 문자열 인덱스로 substring_index(문자열, 추출기준, 개수)
select substring_index('사과, 배, 바나나, 포도, 수박, 딸기', ',', 3); /* 개수를 음수로 표현하면 뒤에서 부터 */
select substring_index('사과, 배, 바나나, 포도, 수박, 딸기', ',', -4);
select substring_index(substring_index('사과, 배, 바나나, 포도, 수박, 딸기', ',', 4), ',', -1);
select substring_index(substring_index('사과, 배, 바나나, 포도, 수박, 딸기', ',', -3), ',', 1);


-- 디비에 있는 생년월일과 시간 출력
insert into sinsang2 values ('gid', '1234', '고인돌', default, default, default, '청주', default);
select name, ipsail from sinsang2;
select name, concat(substr(ipsail, 1, 4), '년 ', substr(ipsail, 6, 2), '월 ', substr(ipsail, 9, 2), '일 ', substr(ipsail, 12, 2), '시 ', substr(ipsail, 15, 2), '분') from sinsang2 where ipsail>'2021-1-1';
select name, ipsail, substr(ipsail, 1) from sinsang2 where name='고인돌';
select concat('성: ', substr(name,1,1),  ', 이름: ', substr(name,2,2)) from sinsang2;

-- 문자열 추출 : mid(문자열, 시작위치, 출력할크기)
select name, ipsail, mid(ipsail, 6, 2) from sinsang2;
select name, ipsail, left(ipsail, 10) from sinsang2; /* 왼쪽부터 */
select name, ipsail, right(ipsail, 8) from sinsang2; /* 오른쪽부터 */

-- 문자 존재 유무 instr(문자열, '검색문자')
select * from sinsang2;
select name, instr(name, '길') from sinsang2; /* 위치를 출력 없으면 0*/
insert into sinsang2 values ('msa', '1234', '못 살아', default, default, default, '청 주', default);
select name, address, instr(name, ' '), instr(address, ' ') from sinsang2;

-- 문자열 치환 replace(문자열, 찾을문자, 바꿀문자)
select name, replace(name, '홍', '가') from sinsang2;
select name, replace(name, ' ', '') from sinsang2;
select address, replace(address, ' ', '') from sinsang2;

-- 날짜 함수
select now(); /* 현재 날짜 시간  출력 */
select year(now()); /* 현재 시스템의 날짜중 연도만 */
select month(now());
select day(now());
select date(now());
select time(now());

select concat(substr(date(now()), 1, 4), '년 ', substr(date(now()), 6, 2), '월 ', substr(date(now()), 9, 2), '일');
select concat(name, '회원의 입사일은 ', substr(ipsail, 1, 4), '년 ', substr(ipsail, 6, 2), '월 ', substr(ipsail, 9, 2), '일 입니다.') from sinsang2 where name='홍길동';
select concat(name, '회원의 입사일은 ', year(ipsail), '년 ', month(ipsail), '월 ', day(ipsail), '일 입니다.') from sinsang2 where name='홍길동';

-- 시간 함수
select hour(now());
select minute(now());
select second(now());

select concat('현재 시간은 ', hour(now()), '시 ', minute(now()), '분 ', second(now()), '초 입니다.');

-- 요일 함수
select week(now()); /* 1년 기준 몇주차인지 */
select dayname(now()); /* 요일 출력 */
select monthname(now()); /* 월 이름으로 출력 */

/* 날짜 형식 지정 date_format(날짜, 포맷) 
 * %Y(4자리), %y(2자리), %M(월 이름), %m(월을 2자리로 출력), %c(월을 한자리로 출력), %d, $e(일을 한자리로 출력)
 * %W(요일이름), %a(요일약자), %b(월약자)
 * %H(24시), %l(12시), %i(분), %s(초)
 */
select * from sinsang2;

select date_format(now(), '%Y-%m-%d');
select date_format(ipsail, '%Y-%c-%d') from sinsang2;
select date_format(ipsail, '%y-%c-%d') from sinsang2;
select date_format(ipsail, '%y-%c-%e') from sinsang2;
select date_format(ipsail, '%Y-%M-%d') from sinsang2;
select date_format(ipsail, '%Y-%m-%d') from sinsang2;
select date_format(ipsail, '%Y-%M-%d %W') from sinsang2;
select date_format(ipsail, '%Y-%b-%d %a') from sinsang2;

select date_format(ipsail, '%H-%i-%s') from sinsang2 where name='소나무';
select date_format(ipsail, '%h-%i-%s') from sinsang2 where name='소나무';
select date_format(now(), '%H-%i_%s');
select date_format(now(), '%h-%i_%s');

select date_format(now(), '%h시 %i분 %s초');

-- SELECT date, SUBSTR( _UTF8'일월화수목금토', DAYOFWEEK(date), 1) AS week FROM 테이블; dayofweek하면 요일이 숫자로 나옴 일요일이 1임
select name, concat(substr('일월화수목금토', dayofweek(ipsail), 1), '요일') as 요일 from sinsang2;

-- 현재 날짜 출력 sysdate(), current_timestamp()
select now(), sysdate(), current_timestamp();

-- 날짜 연산 date_add() interval 명령과 같이 사용
select now(), date_add(now(), interval 1 day);
select now(), date_add(now(), interval 1 hour);
select now(), date_add(now(), interval 30 minute);
select now(), date_add(now(), interval 1 second);
select now(), date_add(now(), interval -1 day);
select now(), date_add(now(), interval 1 year);
select now(), date_add(now(), interval 1 month);
select now(), date_add(now(), interval 24 hour);
select now(), date_add(now(), interval 30 day);

-- 달의 마지막 일자 last_day(날짜형식)
select last_day(now());
select last_day('2021-2-1');
select last_day('2020-2-2');

-- 날짜 차이 계산 to_days()
select now(), now() - 1;
select now(), to_days(now()) - to_days('2021-9-1');
select to_days('2021-1-31') - to_days('2021-1-1');

-- 날짜 비교 datediff()
select datediff(now(), '2021-9-1');

select timestampdiff(quarter, '2021-1-1', now()); /* 분기 */

-- 천단위 마다 ',' 표시 format(수, 소수점 이하 자리) 
select format(1234556, 0);
select format(1234556.123, 0);
select format(1234556.456789, 2);












