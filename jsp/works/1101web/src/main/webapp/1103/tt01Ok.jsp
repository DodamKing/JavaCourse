<%@page import="test.Tt01VO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
	
	Tt01VO vo = new Tt01VO();

	String mid = request.getParameter("mid");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String address = request.getParameter("address");
	int age =Integer.parseInt(request.getParameter("age"));
	
	vo.setMid(mid);
	vo.setPwd(pwd);
	vo.setName(name);
	vo.setGender(gender);
	vo.setAddress(address);
	vo.setAge(age);
%>
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
				<td><%=vo.getMid() %></td>
			</tr>		
			<tr>
				<td>비밀번호</td>
				<td><%=vo.getPwd() %></td>
			</tr>		
			<tr>
				<td>성명</td>
				<td><%=vo.getName() %></td>
			</tr>		
			<tr>
				<td>나이</td>
				<td><%=vo.getAge() %></td>
			</tr>		
			<tr>
				<td>성별</td>
				<td><%=vo.getGender() %></td>
			</tr>		
			<tr>
				<td>주소</td>
				<td><%=vo.getAddress() %></td>
			</tr>
			<tr>
				<td colspan="2"><a href="<%=request.getContextPath() %>/1103/tt01.jsp">돌아가기</a></td>
			</tr>		
		</table>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>