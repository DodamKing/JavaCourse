<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String mid = "";
	Cookie[] cookies = request.getCookies();
	
	for(int i=0; i<cookies.length; i++) {
		if(cookies[i].getName().equals("cMid")) {
			mid = cookies[i].getValue();
			break;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t2_LogMember.jsp</title>
  <%@ include file="../include/bs4.jsp" %>
</head>
<body>
<div class="container">
  <p><br/></p>
	<h2>회원 전용방</h2>
	<hr/>
	<p style="text-align:center;"><img src="../images/3.jpg" width="500px"/></p>
	<hr/>
	<p><font color="blue"><b><%=mid %></b></font>님 로그인 중이십니다.</p>
	<hr/>
	<p>
	  <a href="t2_LoginDel.jsp">쿠키아이디삭제</a> / 
	  <a href="t2_LogOut.jsp">로그아웃</a>
	</p>
	<hr/>
</div>
</body>
</html>