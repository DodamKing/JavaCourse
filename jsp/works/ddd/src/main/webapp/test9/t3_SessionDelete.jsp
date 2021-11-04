<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	session.removeAttribute("sMid");
%>
<script type="text/javascript">
	alert("세션에 아이디 삭제 완료!!");
	history.back();
</script>