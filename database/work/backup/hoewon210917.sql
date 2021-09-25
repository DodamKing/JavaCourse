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


-- javacourse 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `javacourse` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `javacourse`;

-- 테이블 javacourse.hoewon 구조 내보내기
CREATE TABLE IF NOT EXISTS `hoewon` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `mid` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `age` int(11) DEFAULT '20',
  `address` varchar(30) DEFAULT NULL,
  `point` int(11) DEFAULT '100',
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- 테이블 데이터 javacourse.hoewon:~6 rows (대략적) 내보내기
DELETE FROM `hoewon`;
/*!40000 ALTER TABLE `hoewon` DISABLE KEYS */;
INSERT INTO `hoewon` (`idx`, `mid`, `pwd`, `name`, `age`, `address`, `point`) VALUES
	(1, 'hkd1234', '1234', '홍길동', 20, '서울', 100),
	(2, 'kms1234', '1234', '김말숙', 25, '서울', 100),
	(3, 'lkj1234', '1234', '이기자', 29, '청주', 100),
	(5, 'lss1234', '1234', '이순신', 41, '인천', 100),
	(7, 'jbg1234', '1234', '장보고', 33, '포항', 100),
	(8, 'asd1234', '1234', '바보', 1, '머겅', 100);
/*!40000 ALTER TABLE `hoewon` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
