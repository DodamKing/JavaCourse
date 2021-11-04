<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String mid = application.getAttribute("aMid")==null ? "": (String) application.getAttribute("aMid");
	String nickname = application.getAttribute("aNickname")==null ? "": (String) application.getAttribute("aNickname");
	int age = application.getAttribute("aAge")==null ? 0: (int) application.getAttribute("aAge");
	
	int visitCnt = 0;
	if(application.getAttribute("aVCnt") != null) {
		visitCnt = (int) application.getAttribute("aVCnt") + 1;
		application.setAttribute("aVCnt", visitCnt);
	}
	else {
		application.setAttribute("aVCnt", 1);
	}
	
	int vCnt = 0;
	if(session.getAttribute("sVCnt") != null) {
		vCnt = (int) session.getAttribute("sVCnt") + 1;
		session.setAttribute("sVCnt", vCnt);
	}
	else {
		session.setAttribute("sVCnt", 1);
	}
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
	<h2>application 확인</h2>
	<hr/>
	<p>application 아이디 : <%=mid %></p>
	<p>application 닉네임 : <%=nickname %></p>
	<p>application 나이 : <%=age %></p>
	<hr/>
	<p>방문카운트(session) - 현재 : <font color="blue"><%=vCnt %></font> 건</p>
	<p>방문카운트(application) - 모두 : <font color="red"><%=visitCnt %></font> 건</p>
	<hr/>
	<p><a href="t4_ApplicationMain.jsp">돌아가기</a></p>
</div>
</body>
</html>