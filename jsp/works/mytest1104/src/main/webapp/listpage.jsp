<%@page import="test.LoginVo"%>
<%@page import="test.LoginDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	LoginDAO dao = new LoginDAO();
	ArrayList<LoginVo> vos = dao.userList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style>
        h2 {
            background-color: #61bfad;
            padding: 10px;
            border-radius: 15px;
        }
        
        th, td {
            text-align: center;
            font-size: 1.2em;
        }

        tr {
            background-color: #d3e8e1;
        }

        thead tr {
            background-color: #f9f7e8;
        }

        .jumbotron {
            background-color: #b7e3e4;
        }
        
        tbody tr:nth-child(2n) {
            background-color: #c6d7d7;
        }

        tbody tr:hover {
            background-color: #fbfe56;
            cursor: pointer;
        }
    </style>
</head>
<body>
	<div class="container mt-5">
        <div class="jumbotron">
            <h2 class="text-center">회원정보</h2>
            <div class="card-body">
                <table class="table"> 
                    <thead>
                        <tr>
                            <th>번호</th>
                            <th>아이디</th>
                            <th>이름</th>
                            <th>포인트</th>
                            <th>방문횟수</th>
                            <th>최종 방문일</th>
                        </tr>
                    </thead>
                    <tbody>
                    <%
                    	for (int i=0; i<vos.size(); i++) {
							                    		
                    %>
                        <tr>
                            <td><%=i + 1 %></td>
                            <td><%=vos.get(i).getUserId() %></td>
                            <td><%=vos.get(i).getUserNm() %></td>
                            <td><%=vos.get(i).getPoint() %></td>
                            <td><%=vos.get(i).getvCnt() %></td>
                            <td><%=vos.get(i).getfDate() %></td>
                        </tr>
                    <%
                    	}
                    %>
                    </tbody>
                </table>
            </div>
        </div>
        <button class="btn btn-secondary text-right" onclick="script:history.back()">돌아가기</button>
    </div>
</body>
</html>