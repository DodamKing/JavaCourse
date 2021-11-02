<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
  	double amount = Double.parseDouble(request.getParameter("amount")) * 1.1;
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t01.jsp(jsp액션태그연습)</title>
</head>
<body>
	<h2>이곳은 t01.jsp입니다.</h2>
	<jsp:forward page="t01Ok.jsp">
		<jsp:param name="name" value="<%=name %>"/>
		<jsp:param name="amount" value="<%=amount %>"/>
	</jsp:forward>
</body>
</html>