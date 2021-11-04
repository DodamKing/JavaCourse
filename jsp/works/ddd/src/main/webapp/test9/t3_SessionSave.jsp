<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	session.setAttribute("sMid", "hkd1234");
	session.setAttribute("sNick", "홍장군");
	session.setAttribute("sAge", 25);
	
	session.setAttribute("sVcnt", 0);
%>
<script type="text/javascript">
	alert("세션에 정보 저장 완료!!");
	history.back();
</script>