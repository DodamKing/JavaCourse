<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDAO" %> 
<%@ page import="user.UserDAO" %> 
<%@ page import="java.io.PrintWriter" %> <!-- 자바스크립트문을 작성하기 위해 사용 -->
<% request.setCharacterEncoding("UTF-8"); %> <!-- 모든 데이터를 UTF-8로 받음 -->
<jsp:useBean id="bbs" class="bbs.Bbs" scope="page" /> 
<!-- id="빈이름", class="패키지.클래스명", scope="유효범위" page = 현재의 페이지에서만 사용 -->


<jsp:setProperty name="bbs" property="bbsTitle" />
<jsp:setProperty name="bbs" property="bbsContent" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 연습</title>
</head>
<body>

	
	<%
		String mid = null;
		if (session.getAttribute("mid") !=  null){
			mid = (String) session.getAttribute("mid");
		}
		
		if (mid == null){
			PrintWriter script = response.getWriter();
		 	script.println("<script>");
		 	script.println("alert('로그인이 필요합니다.')");
		 	script.println("location.href = 'login.jsp'");
		 	script.println("</script>"); 
		}
	
		if (bbs.getBbsTitle() == null || bbs.getBbsContent() == null) {
			 PrintWriter script = response.getWriter();
			 script.println("<script>");
			 script.println("alert('입력되지 않은 내용이 있습니다.')");
			 script.println("history.back()"); 
			 script.println("</script>");
		}
		else {
			BbsDAO bbsDAO = new BbsDAO();
			UserDAO userDAO = new UserDAO();
			int result = bbsDAO.write(bbs.getBbsTitle(), mid, bbs.getBbsContent());
			
			if (result == -1) {
				 PrintWriter script = response.getWriter();
				 script.println("<script>");
				 script.println("alert('등록에 실패 하였습니다.')");
				 script.println("history.back()"); //이전 페이지로 돌려보냄(join 페이지)
				 script.println("</script>"); 
		 	}
		 
		 	else {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('정상적으로 등록 되었습니다.')");
				script.println("location.href = 'bbs.jsp'"); 
				script.println("</script>");
			}
		}
	%>
</body>
</html>