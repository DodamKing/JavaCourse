<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--  t1_CookiesCheck.jsp -->
<%
	Cookie[] cookies = request.getCookies();

	for(int i=0; i<cookies.length; i++) {
		String strName = cookies[i].getName();	// 쿠키명(변수명) 가져오기
		String strValue = cookies[i].getValue();	// 쿠키값(변수에 저장된 값) 가져오기
		
		out.println("<p>" + (i+1 + ". 저장된 쿠키명 : " + strName));
		out.println(", 저장된 값 : " + strValue + "</p>");
	}
%>
<hr/>
<p><a href="t1_CookiesMain.jsp">돌아가기</a></p>