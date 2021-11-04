<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	application.setAttribute("aMid", "kms5678");
	application.setAttribute("aNickname", "김말숙");
	application.setAttribute("aAge", 33);
	
	/* 현재 브라우저에서의 카운트 증가 */
  session.setAttribute("sVCnt", 0);
	
	/* 어느곳에서 방문해도 카운트 증가 */
  application.setAttribute("aVCnt", 0);
%>
<script>
  alert("application에 정보 저장완료!!!");
  history.back();
</script>