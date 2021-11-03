<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% request.setCharacterEncoding("utf-8"); %>
<c:set var="mid" value="${param.mid}"></c:set>
<c:set var="pwd" value="${param.pwd}"></c:set>
<c:set var="name" value="${param.name}"></c:set>
<c:set var="age" value="${param.age}"></c:set>
<c:set var="address" value="${param.address}"></c:set>
<c:set var="gender" value="${param.gender}"></c:set>
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
				<td>${mid}</td>
			</tr>		
			<tr>
				<td>비밀번호</td>
				<td>${pwd}</td>
			</tr>		
			<tr>
				<td>성명</td>
				<td>${name}</td>
			</tr>		
			<tr>
				<td>나이</td>
				<td>${age}</td>
			</tr>		
			<tr>
				<td>성별</td>
				<td>${gender}</td>
			</tr>		
			<tr>
				<td>주소</td>
				<td>${adress}</td>
			</tr>
			<tr>
				<td colspan="2"><a href="<%=request.getContextPath() %>/1103/tt01.jsp">돌아가기</a></td>
			</tr>		
		</table>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>