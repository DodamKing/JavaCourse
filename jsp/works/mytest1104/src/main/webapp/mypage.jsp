<%@page import="test.LoginVo"%>
<%@page import="test.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	int tday = 0;
	String mid = null;
	String mnm = "사용자";
	LoginVo vo = null;
	if (session.getAttribute("sMid") != null) {
		mid = (String) session.getAttribute("sMid");
		LoginDAO dao = new LoginDAO();
		vo = dao.getVo(mid);
		mnm = vo.getUserNm();
	
	Cookie[] cookies = request.getCookies();
	if (cookies != null && cookies.length > 0) {
		for (int i=0; i<cookies.length; i++) {
			if(cookies[i].getName().equals("cToday_" + mid)) {
				tday = Integer.parseInt(cookies[i].getValue());
			}
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=mnm %>님의 home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
        th, td {
            text-align: center;
            font-size: 1.2em;
        }

        tr {
            background-color: #eee;
        }

    </style>
</head>
<body>
	<div class="container mt-5">
        <div class="jumbotron">
            <h2 class="text-center"><%=mnm %>님의 회원정보</h2>
            <div class="card-body">
                <table class="table table-striped table-hover"> 
                    <tr>
                        <th class="col-2">아이디</th>
                        <td><%=vo.getUserId() %></td>
                    </tr>
                    <tr>
                        <th>이름</th>
                        <td><%=vo.getUserNm() %></td>
                    </tr>
                    <tr>
                        <th>포인트</th>
                        <td><%=vo.getPoint() %> 포인트</td>
                    </tr>
                    <tr>
                        <th>today</th>
                        <td><%=tday %>회</td>
                    </tr>
                    <tr>
                        <th>총 방문횟수</th>
                        <td><%=vo.getvCnt() %> 회</td>
                    </tr>
                    <tr>
                        <th>최종방문일</th>
                        <td><%=vo.getfDate() %></td>
                    </tr>
                </table>
            </div>
        </div>
        <button class="btn btn-secondary" onclick="script:history.back()">돌아가기</button>
        <a class="btn btn-secondary" onclick="return confirm('정말 탈퇴 하시겠습니까?')" href="signout.jsp">회원탈퇴</a>
    </div>
</body>
</html>