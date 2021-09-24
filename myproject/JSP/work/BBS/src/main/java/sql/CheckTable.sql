select * from user;

desc user;

desc bbs;

select * from bbs;

select bbsID from bbs order by bbsID desc;

select count(*) from bbs where bbsAvailable = 1

select * from bbs where bbsAvailable = 1 order by bbsID desc limit 110, 10

select * from user where name like '%관%';

select * from bbs where bbsAvailable = 1 and bbsTitle like '%안녕%' order by bbsID desc limit 0, 10;

select * from bbs where bbsAvailable = 1 and bbsContent like '%내용%' order by bbsID desc limit 10, 10;

select * from bbs where bbsAvailable = 1 and bbsTitle like ? order by bbsID desc limit ?, 10