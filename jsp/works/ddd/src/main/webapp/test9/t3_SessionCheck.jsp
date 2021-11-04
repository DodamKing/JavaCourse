<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String mid = "", nick = "";
	int sAge = 0;
	if (session.getAttribute("sMid") != null) {
	mid = (String) session.getAttribute("sMid");
	}
	if (session.getAttribute("sNick") != null) {
		nick = (String) session.getAttribute("sNick");
	}
	if (session.getAttribute("sAge") != null) {
		sAge = (int) session.getAttribute("sAge");
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
			<h2>세션 확인</h2>
			<p class="mt-5">세션 아이디: <%=mid %></p>
			<p>세션 닉네임: <%=nick %></p>
			<p>세션 나이: <%=sAge %></p>
			<p>세션 고유번호: <%=session.getId() %></p>
			<hr>
			<p><a href="t3_SessionMain.jsp">돌아가기</a></p>
	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>