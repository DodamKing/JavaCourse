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

-- 테이블 javacourse.user 구조 내보내기
CREATE TABLE IF NOT EXISTS `user` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `mid` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `age` int(11) DEFAULT '20',
  `gender` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '남자',
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- 테이블 데이터 javacourse.user:~6 rows (대략적) 내보내기
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`idx`, `name`, `mid`, `password`, `age`, `gender`, `address`) VALUES
	(1, '홍길동', 'hkd1234', '1234', 25, '남자', '서울'),
	(2, '김말숙', 'kms1234', '1234', 32, '여자', '청주'),
	(3, '이기자', 'lgj1234', '1234', 50, '남자', '부산'),
	(4, '김자바', 'kjv1234', '1234', 22, '남자', '청주'),
	(6, '이순신', 'lss1234', '1234', 45, '남자', '바다'),
	(7, '신짱아', 'sja1234', '1234', 3, '여자', '서울');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
