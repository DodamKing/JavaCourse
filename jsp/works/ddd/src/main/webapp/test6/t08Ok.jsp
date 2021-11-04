<%@page import="test.Calculator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String[] product = new String[6];
	if (request.getParameterValues("product") != null) {
		product = request.getParameterValues("product");
	}
	int[] res = new int[6];
	Calculator calc = new Calculator();
	res = calc.sortCalc(product);
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
		<h2>상품 가격별 정렬처리하기</h2>
		<hr/>
		<h2>원본 자료</h2>
		<%
			for (int i=0; i<product.length; i++) {
		%>
		<%=product[i] %>		
		<% 	
			}
		%>
		<hr/>
		<h2>정렬된 자료</h2>
		<%
			for (int i=0; i<res.length; i++) {
		%>
		<%=res[i] %>		
		<% 	
			}
		%>
		<hr/>
		<p><a href="t08.jsp" class="btn btn-success">돌아가기</a></p>
	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>