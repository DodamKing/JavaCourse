<%@page import="test.SungjukVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	//request.setCharacterEncoding("utf-8");
	
	//String strVo = request.getParameter("vo");
	
	SungjukVO vo = (SungjukVO) request.getAttribute("vo");
	
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>title</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<table>
			<tr>
				<th colsapn="2"><h2>개별 학생 성적표</h2></th>
			</tr>
			<tr><td>성명</td><td><%=vo.getName() %></td></tr>
			<tr><td>성별</td><td><%=vo.getGender() %></td></tr>
			<tr><td>학번</td><td><%=vo.getHakbun() %></td></tr>
			<tr><td>국어</td><td><%=vo.getKor() %></td></tr>
			<tr><td>영어</td><td><%=vo.getEng() %></td></tr>
			<tr><td>수학</td><td><%=vo.getMat() %></td></tr>
			<tr><td>총점</td><td><%=vo.getTot() %></td></tr>
			<tr><td>평균</td><td><%=vo.getAvg() %></td></tr>
			<tr><td>학점</td><td><%=vo.getGrade() %></td></tr>
			<tr>
				<th colsapn="2"><a href="1103/sungjuk.jsp">돌아가기</a></th>
			</tr>	
		</table>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>