<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  Cookie cookieMid = new Cookie("cMid","hkd1234");
	cookieMid.setMaxAge(60*60*24);		// 쿠키의 만료시간 지정 : 단위는 '초', 1일(60초*60분*24시간)
	
	Cookie cookiePwd = new Cookie("cPwd","1234");
	cookiePwd.setMaxAge(60*2);		// 쿠키 만료시간을 2분으로 설정
	
	// 쿠키 저장하기(사용자 컴퓨터에 저장된다.)
	response.addCookie(cookieMid);
	response.addCookie(cookiePwd);
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t1_CookiesSave.jsp(쿠키저장하기)</title>
  <%@ include file="../include/bs4.jsp" %>
</head>
<body>
<div class="container">
  <p><br/></p>
	<h2>쿠키 저장완료...</h2>
	<p><a href="t1_CookiesMain.jsp">돌아가기</a></p>
</div>
</body>
</html>