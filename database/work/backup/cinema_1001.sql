-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        5.7.32-log - MySQL Community Server (GPL)
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- cinema 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `cinema` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `cinema`;

-- 테이블 cinema.customer 구조 내보내기
CREATE TABLE IF NOT EXISTS `customer` (
  `name` varchar(50) NOT NULL,
  `customerID` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phoneNum` varchar(50) NOT NULL,
  PRIMARY KEY (`customerID`),
  UNIQUE KEY `customerID` (`customerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 cinema.customer:~7 rows (대략적) 내보내기
DELETE FROM `customer`;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`name`, `customerID`, `password`, `email`, `phoneNum`) VALUES
	('관리자', 'admin', 'admin', 'cinema@naver.com', '000-0000-0000'),
	('홍길동', 'hkd1234', '1234', 'hkd1234@naver.com', '010-1111-2222'),
	('이지은', 'iu1234', '1234', 'iu1234@kakao.com', '000-2222-2222'),
	('저팔계', 'jpg1234', '1234', 'jpg@naver.com', '010-5555-6666'),
	('김말숙', 'kms1234', '1234', 'kms1234@gmail.com', '000-2222-1111'),
	('사오정', 'soj1234', '1234', 'soj1234@naver.com', '010-7777-7777'),
	('손오공', 'son1234', '1234', 'son1234@yahoo.com', '010-2222-3333');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

-- 테이블 cinema.ticket 구조 내보내기
CREATE TABLE IF NOT EXISTS `ticket` (
  `idt` int(11) NOT NULL AUTO_INCREMENT,
  `customerNm` varchar(50) NOT NULL,
  `customerID` varchar(50) NOT NULL,
  `theatherNm` varchar(50) NOT NULL,
  `movieNm` varchar(50) NOT NULL,
  `day` varchar(50) NOT NULL,
  `time` varchar(50) NOT NULL,
  `reserveDate` datetime NOT NULL,
  `cost` varchar(50) NOT NULL,
  `person` varchar(50) NOT NULL,
  `visible` int(11) DEFAULT '1',
  PRIMARY KEY (`idt`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- 테이블 데이터 cinema.ticket:~16 rows (대략적) 내보내기
DELETE FROM `ticket`;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` (`idt`, `customerNm`, `customerID`, `theatherNm`, `movieNm`, `day`, `time`, `reserveDate`, `cost`, `person`, `visible`) VALUES
	(1, '이지은', 'iu1234', 'CGV 청주(서문)', '007 노 타임 투 다이', '2021년 9월 2일', '12:00 ~ 13:30', '2021-09-30 22:54:57', '26000', '2', 0),
	(2, '이지은', 'iu1234', 'CGV 청주지웰시티', '보이스', '2021년 8월 26일', '18:00 ~ 19:30', '2021-09-30 22:59:36', '26000', '2', 1),
	(3, '이지은', 'iu1234', '메가박스 청주사창', '모가디슈', '2021년 9월 9일', '15:00 ~ 16:30', '2021-09-30 23:03:17', '39000', '3', 1),
	(4, '이지은', 'iu1234', '메가박스 청주사창', '극장판 짱구는 못말려: 격돌! 낙서왕국과 얼추 네 명의 용사들', '2021년 9월 5일', '15:00 ~ 16:30', '2021-09-30 23:16:57', '43000', '4', 1),
	(5, '이지은', 'iu1234', 'CGV 청주율량', '미드나이트', '2021년 9월 6일', '21:00 ~ 22:30', '2021-09-30 23:34:16', '13000', '1', 1),
	(6, '이지은', 'iu1234', 'CGV 청주 성안길', '007 노 타임 투 다이', '2021년 8월 30일', '21:00 ~ 22:30', '2021-09-30 23:39:21', '13000', '1', 1),
	(7, '이지은', 'iu1234', '롯데 시네마 서청주 (아울렛)', '해리 포터와 마법사의 돌', '2021년 9월 9일', '09:00 ~ 10:30', '2021-09-30 23:44:35', '65000', '5', 1),
	(8, '이지은', 'iu1234', 'CGV 청주터미널', '말리그넌트', '2021년 9월 30일', '21:00 ~ 22:30', '2021-10-01 00:02:45', '26000', '2', 1),
	(9, '이지은', 'iu1234', 'CGV 청주 성안길', '캔디맨', '2021년 9월 31일', '18:00 ~ 19:30', '2021-10-01 00:10:14', '26000', '2', 1),
	(10, '이지은', 'iu1234', '롯데 시네마 서청주 (아울렛)', '007 노 타임 투 다이', '2021년 10월 3일', '15:00 ~ 16:30', '2021-10-01 09:16:35', '26000', '2', 1),
	(11, '이지은', 'iu1234', '메가박스 청주사창', '인질', '2021년 10월 31일', '12:00 ~ 13:30', '2021-10-01 10:04:01', '13000', '1', 0),
	(12, '이지은', 'iu1234', 'CGV 청주지웰시티', '007 노 타임 투 다이', '2021년 11월 25일', '09:00 ~ 10:30', '2021-10-01 14:53:29', '33000', '3', 0),
	(13, '저팔계', 'jpg1234', 'CGV 청주(서문)', '기적', '2021년 10월 2일', '15:00 ~ 16:30', '2021-10-01 16:47:58', '26000', '2', 1),
	(14, '저팔계', 'jpg1234', 'CGV 청주(서문)', '보이스', '2021년 10월 4일', '09:00 ~ 10:30', '2021-10-01 17:12:07', '13000', '1', 1),
	(15, '이지은', 'iu1234', '메가박스 청주사창', '극장판 포켓몬스터: 정글의 아이, 코코', '2021년 10월 3일', '12:00 ~ 13:30', '2021-10-01 17:26:02', '63000', '6', 0),
	(16, '이지은', 'iu1234', '메가박스 청주사창', '극장판 짱구는 못말려: 격돌! 낙서왕국과 얼추 네 명의 용사들', '2021년 10월 3일', '12:00 ~ 13:30', '2021-10-01 17:31:12', '53000', '5', 1);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
