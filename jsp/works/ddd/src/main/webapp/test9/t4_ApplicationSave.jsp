<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	application.setAttribute("aMid", "kms1234");
	application.setAttribute("aNick", "김말숙");
	application.setAttribute("aAge", 33);
	
	application.setAttribute("aVcnt", 0);
	session.setAttribute("sVcnt", 0);
%>
<script type="text/javascript">
	alert("어플리케이션에 정보 저장 완료!!");
	history.back();
</script>