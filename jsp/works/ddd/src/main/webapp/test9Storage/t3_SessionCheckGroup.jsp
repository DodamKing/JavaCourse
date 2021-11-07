<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t3_SessionCheckGroup.jsp</title>
</head>
<body>
<div class="container">
  <p><br/></p>
	<h2>세션 그룹 확인(열거형 처리)</h2>
	<hr/>
<%
	Enumeration names = session.getAttributeNames();

	while(names.hasMoreElements()) {
		out.println("세션명 : " + names.nextElement() + "<br/>");
	}
%>
	<hr/>
	<p><a href="t3_SessionMain.jsp">돌아가기</a></p>
</div>
</body>
</html>