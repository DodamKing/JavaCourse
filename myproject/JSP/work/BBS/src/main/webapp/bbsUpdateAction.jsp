<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bbs.Bbs" %> 
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
		
		int bbsID = 0;
		if (request.getParameter("bbsID") != null) {
			bbsID = Integer.parseInt(request.getParameter("bbsID"));
		}
		if (bbsID == 0) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('유효하지 않은 글입니다.')");
			script.println("location.href='bbs.jsp'"); 
			script.println("</script>");
		}
	
		BbsDAO bbsDAO = new BbsDAO();
		Bbs bbsVO = bbsDAO.getBbs(bbsID);
		if (!mid.equals(bbsVO.getUserID())) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('권한이 없습니다.')");
			script.println("location.href='bbs.jsp'"); 
			script.println("</script>");
		}
		else {
			if (bbs.getBbsTitle() == null || bbs.getBbsContent() == null || bbs.getBbsTitle().equals("") || bbs.getBbsContent().equals("")) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('입력되지 않은 내용이 있습니다.')");
				script.println("history.back()"); 
				script.println("</script>");
			}
			else {
				int result = bbsDAO.update(bbs.getBbsTitle(), bbs.getBbsContent(), bbsID);
				if (result == -1){
					PrintWriter script = response.getWriter();
					script.println("<script>");
					script.println("alert('글 수정하기에 실패 하였습니다.')");
					script.println("history.back()"); 
					script.println("</script>");
				}
				else {
					PrintWriter script = response.getWriter();
					script.println("<script>");
					script.println("alert('글 수정하기가 정상적으로 처리 되었습니다.')");
					script.println("location.href='bbs.jsp'"); 
					script.println("</script>");
				}
			}
		}
	%>
</body>
</html>