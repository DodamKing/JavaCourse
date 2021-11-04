<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String mid = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		mid = cookies[0].getValue();
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>title</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
			<h2><%=mid %>님 어서 오세요!</h2>
			<p><a href="t2_LoginDel.jsp">쿠키삭제</a></p>
			<p><a href="t2_LoginOut.jsp">로그아웃</a></p>
	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>