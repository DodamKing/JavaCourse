<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pds</title>
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
			<br>
			<h2>이곳은 자료실 화면 입니다.</h2>
			<hr>
			<p>
				<img src="img/4.png">
			</p>
		</div>
		<div id="footer">
			<%@ include file="include_file/footer.jsp" %>
		</div>
	</div>
</body>
</html>