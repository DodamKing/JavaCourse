<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String mid = session.getAttribute("sMid")==null ? "": (String) session.getAttribute("sMid");
	String nickname = session.getAttribute("sNickname")==null ? "": (String) session.getAttribute("sNickname");
	int age = session.getAttribute("sAge")==null ? 0: (int) session.getAttribute("sAge");
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t3_SessionCheck.jsp</title>
  <%@ include file="../include/bs4.jsp" %>
</head>
<body>
<div class="container">
  <p><br/></p>
	<h2>세션 확인</h2>
	<hr/>
	<p>세션 아이디 : <%=mid %></p>
	<p>세션 닉네임 : <%=nickname %></p>
	<p>세션 나이 : <%=age %></p>
	<p>my 세션 아이디 : <%=session.getId() %></p>
	<hr/>
	<p><a href="t3_SessionMain.jsp">돌아가기</a></p>
</div>
</body>
</html>