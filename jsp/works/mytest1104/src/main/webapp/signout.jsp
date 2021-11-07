<%@page import="test.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mid = (String) session.getAttribute("sMid");
	LoginDAO dao = new LoginDAO();
	dao.signOut(mid);
	session.invalidate();
%>
<script>
	alert("탈퇴 되었습니다.");
	location.href = "main.jsp";
</script>
