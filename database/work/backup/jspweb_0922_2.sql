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

-- 테이블 데이터 javacourse.bbs:~15 rows (대략적) 내보내기
DELETE FROM `bbs`;
/*!40000 ALTER TABLE `bbs` DISABLE KEYS */;
INSERT INTO `bbs` (`bbsID`, `bbsTitle`, `userID`, `bbsDate`, `bbsContent`, `bbsAvailable`) VALUES
	(1, '안녕하세요', 'hkd1234', '2021-09-21 22:40:16', '홍길동 입니다.', 1),
	(2, '안녕하세용~', 'kms1234', '2021-09-21 22:42:15', '김말숙 이에요~', 1),
	(3, '이순신 인사드립니다.', 'lss1234', '2021-09-22 00:32:49', '안녕하십니까!!', 1),
	(4, '안녕하세요', 'hkd1234', '2021-09-22 02:04:11', '홍길동 이름으로 글쓰는 중...', 1),
	(5, 'ㅇㅇ', 'hkd1234', '2021-09-22 03:31:01', 'ddddddd', 0),
	(6, '안녕하세요 이기잡니다', 'ljk1234', '2021-09-22 12:08:06', '오늘 처음 가입 했어요', 1),
	(7, '홍길동입니다.', 'hkd1234', '2021-09-22 13:57:33', 'JSP를 이용해서 웹 페이지를 만들어 보고 있습니다.', 1),
	(8, '김태연이에요', 'kty1234', '2021-09-22 17:49:50', '특수문자도 잘 들어 가요\r\n$%$^4\r\n<<\r\n>>\r\n\r\n122%$^":":":"\r\n\r\n즐거운 추석 보내세요>>', 1),
	(9, '제목에도 ^&^*<<>> 잘 들어가죠', 'sja1234', '2021-09-22 17:51:09', '악성 스크립트를 방지 할 수 있어요', 1),
	(10, NULL, NULL, NULL, NULL, 0),
	(11, '김자바 인사드려요', 'kjv1234', '2021-09-22 18:15:19', '자바를 잘하고 싶은 김자바입니다.', 1),
	(12, NULL, NULL, NULL, NULL, 0),
	(13, '강감찬입니다', 'kkc1234', '2021-09-22 21:28:21', '글 쓰기 수정 합니다.\r\n\r\n특수 문자도 잘 들억 가구요\r\n\r\n^&^*;;\r\n\r\n삭제 ㄱㄱ', 0),
	(14, '강감찬이요', 'kkc1234', '2021-09-22 21:53:19', '마지막 시험 테스트 중임니돠\r\n\r\n^^\r\n<><>\r\n\r\n잘 되는 듯 하네요>\r\n\r\n메시지 확인', 1),
	(15, '가입 인사 드려요', 'jyp1234', '2021-09-22 23:07:01', '안녕하세요 \r\n\r\n이번엔 게시글을 수정해 볼꺼에요\r\n\r\n^^\r\n\r\n%^^*\r\n\r\n제와피\r\n>\r\n\r\n내용 잘 들어와 있어요', 0);
/*!40000 ALTER TABLE `bbs` ENABLE KEYS */;

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
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4;

-- 테이블 데이터 javacourse.user:~15 rows (대략적) 내보내기
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`idx`, `name`, `mid`, `password`, `age`, `gender`, `address`) VALUES
	(1, '홍길동', 'hkd1234', '1234', 25, '남자', '서울'),
	(2, '김말숙', 'kms1234', '1234', 32, '여자', '청주'),
	(3, '이기자', 'lgj1234', '1234', 50, '남자', '부산'),
	(4, '김자바', 'kjv1234', '1234', 22, '남자', '청주'),
	(6, '이순신', 'lss1234', '1234', 45, '남자', '바다'),
	(7, '신짱아', 'sja1234', '1234', 3, '여자', '서울'),
	(9, '김태연', 'kty1234', '1234', 32, '여자', '제주'),
	(13, '탱구', 'tk1234', '1234', 23, '여자', '소시'),
	(29, 'r김test 12 ', 'test1234', '1234', 22, '남자', '주소test12'),
	(30, '김테st', 'ttt1234', '1234', 3, '여자', '띄어쓰기  숫자3 영어eng 가'),
	(32, '탱구리', 'tktk1212', '1234', 22, '여자', '정규 화12'),
	(34, '이기자', 'ljk1234', '1234', 44, '남자', '인천'),
	(36, '이영자', 'lyj1234', '1234', 60, '여자', '서울'),
	(37, '강감찬', 'kkc1234', '1234', 58, '남자', '귀주'),
	(38, '박진영', 'jyp1234', '1234', 44, '남자', '니가사는그집');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
