<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>title</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
			<h2>세션 그룹 확인</h2>
			<hr>
			<%
				Enumeration names = session.getAttributeNames();
			
				while (names.hasMoreElements()) {
					out.print("세션명 : " + names.nextElement() + "<br>");
				}
			%>
			<hr>
			<p><a href="t3_SessionMain.jsp">돌아가기</a></p>
	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>