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
CREATE DATABASE IF NOT EXISTS `javacourse` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `javacourse`;

-- 테이블 javacourse.bbs 구조 내보내기
CREATE TABLE IF NOT EXISTS `bbs` (
  `bbsID` int(11) NOT NULL,
  `bbsTitle` varchar(50) DEFAULT NULL,
  `userID` varchar(20) DEFAULT NULL,
  `bbsDate` datetime DEFAULT NULL,
  `bbsContent` varchar(2048) CHARACTER SET utf8 DEFAULT NULL,
  `bbsAvailable` int(11) DEFAULT NULL,
  PRIMARY KEY (`bbsID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 내보낼 데이터가 선택되어 있지 않습니다.
-- 테이블 javacourse.login 구조 내보내기
CREATE TABLE IF NOT EXISTS `login` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `mid` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `point` int(11) DEFAULT '100',
  `lastDate` datetime DEFAULT CURRENT_TIMESTAMP,
  `Vcount` int(11) DEFAULT '0',
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.
-- 테이블 javacourse.user 구조 내보내기
CREATE TABLE IF NOT EXISTS `user` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `mid` varchar(50) CHARACTER SET utf8 NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 NOT NULL,
  `age` int(11) DEFAULT '20',
  `gender` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '남자',
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4;

-- 내보낼 데이터가 선택되어 있지 않습니다.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
