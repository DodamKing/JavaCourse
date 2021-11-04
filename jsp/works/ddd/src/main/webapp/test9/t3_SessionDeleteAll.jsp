<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	session.invalidate();
%>
<script type="text/javascript">
	alert("세션 삭제 완료!!");
	history.back();
</script>