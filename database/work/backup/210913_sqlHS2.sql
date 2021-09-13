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


-- sample2 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `sample2` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sample2`;

-- 테이블 sample2.sinsang2 구조 내보내기
CREATE TABLE IF NOT EXISTS `sinsang2` (
  `mid` varchar(15) NOT NULL,
  `pwd` varchar(15) NOT NULL,
  `name` varchar(20) NOT NULL,
  `age` int(11) DEFAULT '20',
  `gender` char(2) DEFAULT '여자',
  `ipsail` datetime DEFAULT CURRENT_TIMESTAMP,
  `address` varchar(50) DEFAULT NULL,
  `point` int(11) DEFAULT '1000'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테이블 데이터 sample2.sinsang2:~12 rows (대략적) 내보내기
DELETE FROM `sinsang2`;
/*!40000 ALTER TABLE `sinsang2` DISABLE KEYS */;
INSERT INTO `sinsang2` (`mid`, `pwd`, `name`, `age`, `gender`, `ipsail`, `address`, `point`) VALUES
	('hong', '0000', '홍길동', 25, '남자', '1990-10-05 00:00:00', '서울', 1800),
	('kim', '1234', '김말숙', 33, '여자', '1997-12-03 00:00:00', '부산', 2100),
	('lee', '1234', '이순자', 24, '여자', '1985-07-25 00:00:00', '광주', 1600),
	('lee1', '1234', '이기자', 40, '남자', '1999-10-03 00:00:00', '울산', 1550),
	('bae', '1234', '배은숙', 19, '여자', '1993-11-22 00:00:00', '마산', 1600),
	('son', '1234', '손기정', 45, '여자', '1987-12-15 00:00:00', '제주', 500),
	('kim1', '0000', '김영숙', 36, '여자', '2002-10-05 00:00:00', '서울', 2400),
	('kim2', '1234', '김영철', 39, '남자', '1988-10-05 00:00:00', '인천', 500),
	('lee2', '0000', '이겨라', 29, '남자', '2000-10-09 00:00:00', '서울', 1800),
	('son2', '0000', '손오공', 23, '남자', '2005-12-15 00:00:00', '서울', 1800),
	('park', '1234', '박세리', 35, '여자', '2021-09-13 10:42:02', '인천', 1500),
	('snm', '1234', '소나무', 22, '남자', '2021-09-13 13:04:31', '청주', 1000);
/*!40000 ALTER TABLE `sinsang2` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
