<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--   t1_CookiesDelete.jsp -->
<%
	Cookie[] cookies = request.getCookies();

	if(cookies != null) {
		for(int i=0; i<cookies.length; i++) {
			cookies[i].setMaxAge(0);				// 쿠키의 만료시간을 0으로 지정하면 해당 쿠키가 삭제 설정된다.
			response.addCookie(cookies[i]); // 응답헤더에 정보를 추가한다.
		}
	}
%>
<hr/>
<h2>쿠기 삭제 완료</h2>
<p><a href="t1_CookiesMain.jsp">돌아가기</a></p>