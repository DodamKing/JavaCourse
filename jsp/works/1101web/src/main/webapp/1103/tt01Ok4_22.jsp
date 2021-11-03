<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="vo" class="test.Tt01VO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>title</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
	<style>
		td {
			text-align: center;
		}
	</style>
<body>
	<div class="container mt-5">
	<h2>회원정보</h2>
		<table class="table table-hover">
			<tr>
				<td>아이디</td>
				<td><jsp:getProperty property="mid" name="vo"/></td>
			</tr>		
			<tr>
				<td>비밀번호</td>
				<td><jsp:getProperty property="pwd" name="vo"/></td>
			</tr>		
			<tr>
				<td>성명</td>
				<td><jsp:getProperty property="name" name="vo"/></td>
			</tr>		
			<tr>
				<td>나이</td>
				<td><jsp:getProperty property="age" name="vo"/></td>
			</tr>		
			<tr>
				<td>성별</td>
				<td><jsp:getProperty property="gender" name="vo"/></td>
			</tr>		
			<tr>
				<td>주소</td>
				<td><jsp:getProperty property="address" name="vo"/></td>
			</tr>
			<tr>
				<td colspan="2"><a href="<%=request.getContextPath() %>/1103/tt01.jsp">돌아가기</a></td>
			</tr>		
		</table>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>