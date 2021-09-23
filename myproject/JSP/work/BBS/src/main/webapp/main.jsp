<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/thml; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">
<title>JSP 연습</title>
</head>
<body style= "background-color : lightblue;">
	<%
		String mid = null;
		if(session.getAttribute("mid") != null) {
			mid = (String) session.getAttribute("mid");
		} //로그인이 된 회원은 로그인의 정보를 담을수 있도록 설정  
	%>

	<audio controls loop controls autoplay>
		<source src="Purple+Cat+-+메이엘로(Maiello)ㅣFree+BGM.mp3" type="audio/mpeg" >
	</audio>
	<!-- 오디오 태그, hidden => 오디오창 안보이게, loop => 무한반복, autoplay => 자동재생 -->

		<nav class="navbar navbar-inverse"> <!-- 네비게이션 -->
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
				<li class="active"><a href="main.jsp">메인</a></li>
				<li><a href="bbs.jsp">게시판</a></li>
			</ul>
			<%
				if(mid == null) { //로그인이 되어있지 않았을때, 
			%>
			
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">접속하기<span class="caret"></span></a>
						<!-- 임시의 주소링크 "#"을 기재한다. -->
						<!-- caret = creates a caret arrow icon (▼) -->
				
					<ul class="dropdown-menu">
						<!-- dropdown-menu : 버튼을 눌렀을때, 생성되는 메뉴(접속하기를 눌렀을때 로그인, 회원가입 메뉴 -->
				
						<li><a href="login.jsp">로그인</a></li>
						<li><a href="join.jsp">회원가입</a></li>
					</ul>
				</li>	
			</ul>
			
			<%
				} 
				else {	//로그인이 되었을때
			%>	
			
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">회원관리<span class="caret"></span>
					</a>
						<!-- 임시의 주소링크 "#"을 기재한다. -->
						<!-- caret = creates a caret arrow icon (▼) -->
				
					<ul class="dropdown-menu">
						<!-- dropdown-menu : 버튼을 눌렀을때, 생성되는 메뉴(접속하기를 눌렀을때 로그인, 회원가입 메뉴 -->
				
						<li><a href="profile.jsp">회원정보</a></li>
						<li><a href="userUpdate.jsp">정보수정</a></li>
						<li><a onclick="return confirm('정말 로그아웃 하시겠습니까?')" href="logoutAction.jsp" >로그아웃</a></li>
						<li><a onclick="retrun confirm('정말 탈퇴 하시겠습니까?')" href="dropoutAction.jsp" >회원탈퇴</a></li>
					</ul>
				</li>	
			</ul>	
			<% 
				}
			%>
		</div>
	</nav>
	
	<div class="container"> 
		<div class="jumbotron">
			<div class="container">
				<h1>게시판 프로젝트</h1>
				<p>웹페이지의 회원관리와 게시판의 게시글 관리로 기본적인 CRUD를 익힙니다.</p>
				<p>jsp를 이용해봤습니다. was는 tomcat을 사용했습니다.</p>
				<p>디자인 템플릿으로는 부트스트랩을 이용했습니다.</p>
				<p><a class="btn btn-primary btn-pull" href="#" role="button">자세히 알아보기</a></p>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
				<li date-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li date-target="#myCarousel" data-slide-to="0" ></li>
				<li date-target="#myCarousel" data-slide-to="0" ></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active">
					<img class="img-responsive center-block" src="images/1.png">
				</div>
				<div  class="item">
					<img class="img-responsive center-block" src="images/1.jpg">
				</div>
				<div class="item">
					<img class="img-responsive center-block" src="images/1.jpeg">
				</div>
			</div>
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span>
			</a>
			<a class="right carousel-control" href="#myCarousel" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
	
</body>
</html>