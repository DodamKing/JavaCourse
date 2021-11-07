<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String saveId = "";
	String checked = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null && cookies.length > 0) {
		for (int i=0; i<cookies.length; i++) {
			if(cookies[i].getName().equals("cMid")) {
				saveId = cookies[i].getValue();
				checked = "checked";
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log In</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="css/login.css">
</head>
<body>
	<div class="main-container">
        <section>
            <div class="container p-3 my-3 border">
                <h4 class="text-right mr-2"><a href="main.jsp">DD Music</a></h4>
                <div class="form-container">
                    <form action="<%=request.getContextPath() %>/Login" name="loginForm" method="post">
                        <h2 class="text-center">로그인</h2>
                        <div class="form-group">
                            <input class="form-control input-control" type="text" id="userId" name="userId" value="<%=saveId %>" placeholder="아이디" autofocus required>
                        </div>
                        <div class="form-group">
                            <input class="form-control input-control" type="password" id="password" name="password" placeholder="비밀번호" required>
                        </div>
                        <div class="form-group">
                            <input class="check-control" type="checkbox" id="loginCheck" name="loginCheck" value="true" <%=checked %>><span class="login-status">아이디 기억 하기</span>
                        </div>
                        <div id="demo" class="demo-box"></div>
                        <div class="form-group">
                            <input class="form-control login-control" type="submit" id="login_btn" name="login_btn" value="로그인">
                        </div>
                        <div class="d-flex form-foot">
                            <div class="p-2 mr-auto"><a href="signup.jsp">회원가입</a></div>
                            <div class="p-2 control-r"><a href="">계정 찾기</a></div>
                            <div class="p-2 control-r">|</div>
                            <div class="p-2 control-r"><a href="">비밀번호 찾기</a></div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <footer class="container">
            Copyrigth <strong>© DoubleD.</strong> All rights reserced.
        </footer>
    </div>
</body>
</html>