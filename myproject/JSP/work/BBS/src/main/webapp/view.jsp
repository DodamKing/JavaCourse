<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="bbs.Bbs" %>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="user.UserDAO" %>
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
		
		int bbsID = 0;
		if (request.getParameter("bbsID") != null) {
			bbsID = Integer.parseInt(request.getParameter("bbsID"));
		}
		
		if (bbsID == 0) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('유효하지 않은 글입니다.')");
			script.println("location.href='bbs.jsp");
			script.println("</script>");
		}
		
		UserDAO userDAO = new UserDAO();
		Bbs bbs = new BbsDAO().getBbs(bbsID);
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
				<li><a href="main.jsp">메인</a></li>
				<li class="active"><a href="bbs.jsp">게시판</a></li>
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
								<li><a onclick="return confirm('정말 로그아웃 하시겠습니까?')" href="logoutAction.jsp">로그아웃</a></li>
								<li><a onclick="return confirm('정말 탈퇴 하시겠습니까?')" href="dropoutAction.jsp">회원탈퇴</a></li>
							</ul>
					</li>	
				</ul>	
			<% 
				}
			%>
			
		</div>
	</nav>
	
	<!-- 게시판 글보기 양식 영역 시작 -->
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; border: 3px solid #e2e2e2">
				<thead>
					<tr>
						<th colspan="2" style="background-color: #eeeeee; text-align: center;">게시판 글 보기</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style="width: 20%;">글 제목</td>
						<td colspan="2" style="text-align: left; border: 2px solid #e2e2e2"><%= bbs.getBbsTitle().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>") %></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td colspan="2" style="text-align: left; border: 2px solid #e2e2e2"><%= userDAO.getName(bbs.getUserID()) %></td>
					</tr>
					<tr>
						<td>작성일자</td>
						<td colspan="2" style="text-align: left; border: 2px solid #e2e2e2"><%= bbs.getBbsDate().substring(0, 11) + bbs.getBbsDate().substring(11, 13) + "시" + bbs.getBbsDate().substring(14, 16) + "분" %></td>
					</tr>
					<tr>
						<td>내용</td>
						<td colspan="2" style="min-height: 200px; text-align: left; border: 2px solid #e2e2e2"><%= bbs.getBbsContent().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>") %></td>
					</tr>
				</tbody>
			</table>
			<!-- 목록 버튼 생성 -->
			<a href="bbs.jsp" class="btn btn-primary pull-right">목록</a>
			
			<!-- 수정 삭제 버튼 생성 -->
			<%
				if (mid != null && mid.equals(bbs.getUserID())) {
			%>
					<a onclick="return confirm('수정 하시겠습니까?')" href="bbsUpdate.jsp?bbsID=<%= bbsID %>" class="btn btn-primary">수정</a>
					<a onclick="return confirm('정말 삭제 하시겠습니까?')" href="deleteAction.jsp?bbsID=<%= bbsID %>" class="btn btn-primary">삭제</a>
			<%
				}
			%>
		</div>
	</div>
	<!-- 게시판 글쓰기 양식 영역 끝 -->
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
	
</body>
</html>