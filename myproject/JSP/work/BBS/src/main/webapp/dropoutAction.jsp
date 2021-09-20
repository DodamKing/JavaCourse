<%@page import="user.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 연습</title>
</head>
<body>
	<%
	String mid = (String) session.getAttribute("mid");
	UserDAO dao = new UserDAO();	
	dao.dropout(mid);
	session.invalidate();
	%>
	
	<script>
		alert('정상 탈퇴 처리 되었습니다.');
		location.href = 'main.jsp';	
	</script>
</body>
</html>