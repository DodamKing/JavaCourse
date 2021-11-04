<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	session.setAttribute("sMid", "hkd1234");
  session.setAttribute("sNickname", "홍장군");
  session.setAttribute("sAge", 25);
%>
<script>
  alert("세션에 정보 저장완료!!!");
  history.back();
</script>