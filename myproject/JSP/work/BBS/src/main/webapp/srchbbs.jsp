<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="user.UserDAO" %>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="bbs.Bbs" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">
<title>JSP 연습</title>
<style type="text/css">
	a, a:hover{
		color: #000000;
		text-decoration: none;
	}
</style>
</head>
<body style= "background-color : lightblue;">
	<%	
		request.setCharacterEncoding("utf-8");
	
		String mid = null;
		if(session.getAttribute("mid") != null) {
			mid = (String) session.getAttribute("mid");
		} //로그인이 된 회원은 로그인의 정보를 담을수 있도록 설정  
		
		int pageNumber = 1; // 첫페이지 번호 1
		if (request.getParameter("pageNumber") != null) {
			if (Integer.parseInt(request.getParameter("pageNumber")) <= 0) {
				pageNumber = 1;				
			}
			else {
				pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
				//System.out.println(pageNumber);
			}
		} // 오브젝트 타입의 파라미터로 넘어온 게 존재하면 int로 형 변환 해서 세팅 
		
		String srchKey = null;
		if (request.getParameter("srchKey") != null) {
			srchKey = java.net.URLDecoder.decode(request.getParameter("srchKey"), "utf-8"); //디코딩해서 받기 시도 해봤으나 디코딩 해서 받아도 같은 현상 발생 그냥 디코딩 안하고 해도 됨
			//System.out.println(srchKey);
		}
		
		String srchText = null;	
		if (request.getParameter("srchText") != null) {
			srchText = java.net.URLDecoder.decode(request.getParameter("srchText"), "utf-8") ;
			//System.out.println(srchText);
		}
		
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
	
	<div>
		<form method="post" class="pull-right" action="srchbbs.jsp">
			<fieldset>
                   <label>검색분류</label>
                       <select name = "srchKey">
                           <option ${(param.srchKey == "bbsTitle")? "selected" : ""} value = "bbsTitle">제목</option>
                           <option ${(param.srchKey == "bbsContent")? "selected" : ""} value = "bbsContent">내용</option>
                       </select>
                   <label>검색어</label>
                       <input type = "text" name = "srchText" value = "${param.srchText}"/>
                       <input type = "submit" class="btn btn-primary" value = "검색">                
               </fieldset>        
		</form>	
	</div>	
	
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align: center;">번호</th>
						<th style="background-color: #eeeeee; text-align: center;">제목</th>
						<th style="background-color: #eeeeee; text-align: center;">작성자</th>
						<th style="background-color: #eeeeee; text-align: center;">작성일</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<%
							UserDAO userDAO = new UserDAO();
							BbsDAO bbsDAO = new BbsDAO();
							ArrayList<Bbs> searchList = bbsDAO.getSrchList(srchKey, srchText, pageNumber);
							//System.out.println(searchList);
							int cnt = bbsDAO.getSrchCount(srchKey, srchText) - ((pageNumber - 1) * 10);
							for (int i=0; i<searchList.size(); i++) {
						%>
						<td><%= cnt %></td>
						<td><a href="view.jsp?bbsID=<%= searchList.get(i).getBbsID() %>">
							<%= searchList.get(i).getBbsTitle().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br>") %></a></td>
						<td><a href="userbbs.jsp?userID=<%= searchList.get(i).getUserID() %>">
							<%= userDAO.getName(searchList.get(i).getUserID()) %></a></td>
						
						<td><%= searchList.get(i).getBbsDate().substring(0, 11) + searchList.get(i).getBbsDate().substring(11, 13) + "시" + searchList.get(i).getBbsDate().substring(14, 16) + "분" %></td>
					</tr>
					<%
							cnt--;
							}
					%>
				</tbody>
			</table>
			
			<!-- 페이징 처리 영역 -->
			<%
				int lastPage = 1;
				if (bbsDAO.getSrchCount(srchKey, srchText) > 0) {
					lastPage = (int) Math.ceil(bbsDAO.getSrchCount(srchKey, srchText)/10.0);
				}
			%>
			
				<a href="srchbbs.jsp?pageNumber=<%=1 %>&srchKey=<%=srchKey %>&srchText=<%=srchText %>"
					class="btn btn-success btn-arraw-left">처음</a>
			<%
				if (pageNumber != 1) {
			%>
				<a href="srchbbs.jsp?pageNumber=<%=pageNumber - 1 %>&srchKey=<%=srchKey %>&srchText=<%=srchText %>"
					class="btn btn-success btn-arraw-left">이전</a>
			<%
				} if (bbsDAO.srchNextPage(srchKey, srchText, pageNumber + 1)) {
			%>
				<a href="srchbbs.jsp?pageNumber=<%=pageNumber + 1 %>&srchKey=<%=srchKey %>&srchText=<%=srchText %>"
					class="btn btn-success btn-arraw-left">다음</a>
			<%
				}
			%>
				<a href="srchbbs.jsp?pageNumber=<%=lastPage %>&srchKey=<%=srchKey %>&srchText=<%=srchText %>"
					class="btn btn-success btn-arraw-left">마지막</a>
			
			<!-- 글쓰기 버튼 생성 -->
			<a href="write.jsp" class="btn btn-primary pull-right">글쓰기</a>
			<%
			if (mid != null) {
			%>
			<a href="mybbs.jsp" class="btn btn-primary pull-right">내글보기</a>
			<%
			} 
			%>
		</div>
	</div>
	<!-- 게시판 메인 페이지 영역 끝 -->
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
	
</body>
</html>