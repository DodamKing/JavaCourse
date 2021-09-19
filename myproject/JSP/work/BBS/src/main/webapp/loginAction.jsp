<%@page import="java.io.PrintWriter"%>
<%@page import="user.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="mid" />
<jsp:setProperty name="user" property="password" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 게시판 웹 사이트</title>
</head>
<body>
	<%
		String mid = null;
		if (session.getAttribute("mid") !=  null){
			mid = (String) session.getAttribute("mid");
		}
		
		if (mid != null){
			PrintWriter script = response.getWriter();
		 	script.println("<script>");
		 	script.println("alert('이미 로그인 되어있습니다.')");
		 	script.println("location.href = 'main.jsp'");
		 	script.println("</script>"); 
		}
	
		UserDAO dao = new UserDAO();
		int result = dao.login(user.getMid(), user.getPassword());
		if (result == 1) {
			session.setAttribute("mid", user.getMid());
			PrintWriter script = response.getWriter();
		 	script.println("<script>");
		 	script.println("location.href = 'main.jsp'");
		 	script.println("</script>"); 
		}
		else if (result == 0){
			PrintWriter script = response.getWriter();
		 	script.println("<script>");
		 	script.println("alert('비밀번호가 틀립니다.')");
		 	script.println("history.back()"); //이전 페이지로 돌려보냄(login 페이지)
		 	script.println("</script>");
		}
		else if (result == -1){
		 	PrintWriter script = response.getWriter();
	 		script.println("<script>");
		 	script.println("alert('존재하지 않는 아이디입니다!!')");
		 	script.println("history.back()"); //이전 페이지로 돌려보냄(login 페이지)
		 	script.println("</script>");
		}
		else if (result == -2){
		 	PrintWriter script = response.getWriter();
		 	script.println("<script>");
		 	script.println("alert('데이터베이스 오류가 발생했습니다!!')");
			script.println("history.back()"); //이전 페이지로 돌려보냄(login 페이지)
			script.println("</script>");
		}
		
	%>
</body>
</html>