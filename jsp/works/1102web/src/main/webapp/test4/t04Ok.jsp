<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	request.setCharacterEncoding("utf-8");

	String[] language = request.getParameterValues("language");
	String otherLang = request.getParameter("otherLang");
	String strLanguage = "";
	
	if (language == null) {
		out.print("<script>");
		out.print("alert('입력하셔')");
		out.print("history.back()");
		out.print("<script>");
	}
	else {
		for (String lang : language) {
			strLanguage += lang + " / ";
		}
		strLanguage += otherLang;
	}
%>

<table border cellpadding="10px" cellspacing="0px">
  <tr>
    <th colspan="2">분류</th>
  </tr>
  <tr>
    <td>사용 가능 언어</td>
    <td><%=strLanguage %></td>
  </tr>
</table>
