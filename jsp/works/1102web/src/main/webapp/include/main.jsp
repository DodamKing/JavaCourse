<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String sw = "";
	if (request.getParameter("sw") != null) {
		sw = request.getParameter("sw");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<style type="text/css">
	body {
		width: 1000px;
		margin: 0px auto;
		padding: 0px;
	}
	
	#header {
		background-color: aqua;
		text-align: center;
		height: 80px;
	}
	
	#content {
		background-color: #ddd;
		text-align: center;
	}
	
	#footer {
		background-color: #aaa;
		text-align: center;
		height: 80px;
	}
	
</style>
</head>
<body>
	<div class="container">
		<div id="header">
			<%@ include file="include_file/menu.jsp" %>
		</div>
		<div id="content">
		
			<%
				if (sw.equals("board")) {
					
			%>
					<%@include file="board.jsp" %>
			<%		
				} else if (sw.equals("guest")) {
			%>
			<%@include file="guest.jsp" %>
			<%		
				} else if (sw.equals("pds")) {
			%>
			<%@include file="pds.jsp" %>
			<%		
				} else if (sw.equals("gallery")) {
			%>
			<%@include file="gallery.jsp" %>
			<%		
				} else if (sw.equals("guest")) {
			%>
			
			<%  } else { %>
		
			<br>
			<h2>이곳은 메인 화면 입니다.</h2>
			<hr>
			<p>
				<img src="../img/1.png">
			</p>
			<p>즐거운 시간 되세요</p>
		</div>
		<% } %>
		<div id="footer">
			<%@ include file="include_file/footer.jsp" %>
		</div>
	</div>
</body>
</html>