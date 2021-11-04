<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String mid = "", nick = "";
	int sAge = 0;
	int aVcnt = 0;
	int sVcnt = 0;
	if (application.getAttribute("aMid") != null) {
	mid = (String) application.getAttribute("aMid");
	}
	if (application.getAttribute("aNick") != null) {
		nick = (String) application.getAttribute("aNick");
	}
	if (application.getAttribute("aAge") != null) {
		sAge = (int) application.getAttribute("aAge");
	}

	if (application.getAttribute("aVcnt") != null) {
		aVcnt = (int) application.getAttribute("aVcnt") + 1;
		application.setAttribute("aVcnt", aVcnt);
	}
	else {
		application.setAttribute("aVcnt", 1);
	}
	
	if (session.getAttribute("sVcnt") != null) {
		sVcnt = (int) session.getAttribute("sVcnt") + 1;
		session.setAttribute("sVcnt", sVcnt);
	}
	else {
		session.setAttribute("sVcnt", 1);
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
			<h2>에플리케이션 확인</h2>
			<p class="mt-5">에플리케이션 아이디: <%=mid %></p>
			<p>에플리케이션 닉네임: <%=nick %></p>
			<p>에플리케이션 나이: <%=sAge %></p>
			<hr>
			<p>세션 방문 횟수: <%=sVcnt %>건</p>
			<p>에플리케이션 방문 횟수: <%=aVcnt %>건</p>
			<hr>
			<p><a href="t4_ApplicationMain.jsp">돌아가기</a></p>
	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>