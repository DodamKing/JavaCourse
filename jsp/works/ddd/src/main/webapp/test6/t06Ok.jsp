<%@page import="test.Calculator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int su = 0, exp = 0;
	if (request.getParameter("su") != null) {
	su = Integer.parseInt(request.getParameter("su"));
	}
	if (request.getParameter("exp") != null) {
	exp = Integer.parseInt(request.getParameter("exp"));
	}
	
	Calculator calc = new Calculator();
	int res = calc.expCalc(su, exp);
	
	
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
			<h2>거듭 제곱 결과</h2>
			<p><%=su %>의 <%=exp %>제곱은 <%=res %>입니다.</p>
			<p class="btn btn-primary"><a href="t06.jsp">돌아가기</a></p>
	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>