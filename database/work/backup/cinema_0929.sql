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

-- 테이블 데이터 cinema.customer:~5 rows (대략적) 내보내기
DELETE FROM `customer`;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`name`, `customerID`, `password`, `email`, `phoneNum`) VALUES
	('관리자', 'admin', 'admin', 'cinema@naver.com', '000-0000-0000'),
	('홍길동', 'hkd1234', '1234', 'hkd1234@naver.com', '010-1111-2222'),
	('이지은', 'iu1234', '1234', 'iu1234@kakao.com', '000-2222-2222'),
	('김말숙', 'kms1234', '1234', 'kms1234@gmail.com', '000-2222-1111'),
	('손오공', 'son1234', '1234', 'son1234@yahoo.com', '010-2222-3333');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
