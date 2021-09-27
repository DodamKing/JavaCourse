<%@page import="user.User"%>
<%@page import="user.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">
<title>JSP 연습</title>
</head>
<body>
		<nav class="navbar navbar-default"> <!-- 네비게이션 -->
		<div class="navbar-header"> 	<!-- 네비게이션 상단 부분 -->
			<!-- 네비게이션 상단 박스 영역 -->
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<!-- 이 삼줄 버튼은 화면이 좁아지면 우측에 나타난다 -->
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<!-- 상단 바에 제목이 나타나고 클릭하면 main 페이지로 이동한다 -->
			<a class="navbar-brand" href="main.jsp">JSP 연습 사이트</a>
		</div>
		<!-- 게시판 제목 이름 옆에 나타나는 메뉴 영역 -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="main.jsp">메인</a></li>
				<li><a href="bbs.jsp">게시판</a></li>
			</ul>
			<!-- 헤더 우측에 나타나는 드랍다운 영역 -->
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">회원관리<span class="caret"></span></a>
					<!-- 드랍다운 아이템 영역 -->	
					<ul class="dropdown-menu">
						<li class="active"><a href="profile.jsp">회원정보</a></li>
						<li><a href="userUpdate.jsp">정보수정</a></li>
						<li><a onclick="return confirm('정말 로그아웃 하시겠습니까?')" href="logoutAction.jsp">로그아웃</a></li>
						<li><a onclick="return confirm('정말 탈퇴 하시겠습니까?')" href="dropoutAction.jsp">회원탈퇴</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>

<%
	request.setCharacterEncoding("utf-8");
	String mid = (String) session.getAttribute("mid");
	UserDAO dao = new UserDAO();
	User user = dao.profile(mid);
	String password = user.getPassword();
	String name = user.getName();
	String gender = user.getGender();
	int age = user.getAge();
	String address = user.getAddress();
%>


<div class="container">		<!-- 하나의 영역 생성 -->
		<div class="col-lg-4">	<!-- 영역 크기 -->
			<!-- 점보트론은 특정 컨텐츠, 정보를 두드러지게 하기 위한 큰 박스 -->
			<div class="jumbotron" style="padding-top: 20px;">
				<h3 style="text-align: center;">회원정보</h3>
					<table border=1 style="width:800px; heigth:200px; align:center">
					    <tr align="center" bgcolor="#FFFF66">
					        <th>아이디</th>
					        <th>비밀번호</th>
					        <th>이름</th>
					        <th>성별</th>
					        <th>나이</th>
					        <th>주소</th>
					    </tr>
					    <tr align="center">
					        <td><%= mid %></td>
					        <td><%= password %></td>
					        <td><%= name %></td>
					        <td><%= gender %></td>
					        <td><%= age %></td>
					        <td><%= address %></td>
					    </tr>
					</table>
			</div>
		</div>	
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>