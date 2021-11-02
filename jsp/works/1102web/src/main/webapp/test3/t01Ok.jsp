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
  <title>t01Ok.jsp(forword액션태그)</title>
</head>
<body>
	<h2>이곳은 t01Ok.jsp 입니다.</h2>
	<p>전송된 이름은? <%=name %></p>
	<p>할증된 가격은? <%=amount %></p>
	<!-- <p><a href="t01Result.jsp">결과보기</a></p> -->
</body>
</html>