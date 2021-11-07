<%@page import="test.LoginDAO"%>
<%@page import="test.LoginVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mid = (String) session.getAttribute("sMid");

	LoginDAO dao = new LoginDAO();
	LoginVo vo = dao.getVo(mid);
	int point = vo.getPoint() + 10;
	dao.logoutBonus(mid, point);

	session.removeAttribute("sMid");
	out.println("<script>");
	out.println("location.href = 'main.jsp'");
	out.println("</script>");
%>