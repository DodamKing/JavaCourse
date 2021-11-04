<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- t3_SessionDelete.jsp -->
<%
  session.removeAttribute("sMid");
%>
<script>
  alert("세션에 저장된 아이디 삭제완료!!!");
  history.back();
</script>