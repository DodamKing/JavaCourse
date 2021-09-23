select * from user;

desc user;

desc bbs;

select * from bbs;

select bbsID from bbs order by bbsID desc;

select count(*) from bbs where bbsAvailable = 1

select * from bbs where bbsAvailable = 1 order by bbsID desc limit 110, 10
