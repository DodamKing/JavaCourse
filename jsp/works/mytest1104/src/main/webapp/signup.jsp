<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="css/signup.css?ver=1">
</head>
<body>
	<div class="main-container">
        <section>
            <div class="container p-3 my-3 border">
            <h4 class="text-right mr-2"><a href="main.jsp">DD Music</a></h4>
                <div class="form-container">
                    <form action="<%=request.getContextPath() %>/Signup" name="signForm" method="post">
                        <h2 class="text-center">회원가입</h2>
                        <div class="form-group">
                            <div class="lbl">
                                <span style="color: red;"><b>*</b></span> 아이디
                            </div>
                            <input class="form-control input-control" type="text" id="userId" name="userId" placeholder="아이디" autofocus required>
                            <div id="demo1" class="demo-box"></div>
                        </div>
                        <div class="form-group">
                            <div class="lbl">
                                <span style="color: red;"><b>*</b></span> 비밀번호
                            </div>
                            <input class="form-control input-control" type="password" id="password" name="password" placeholder="비밀번호" required>
                            <input type="checkbox" id="typeChange"> 비빌번호 보기
                            <div id="demo2" class="demo-box"></div>
                        </div>
                        <div class="form-group">
                            <div class="lbl">
                                <span style="color: red;"><b>*</b></span> 이름
                            </div>
                            <input class="form-control input-control" type="text" id="userNm" name="userNm" placeholder="이름" required>
                            <div id="demo5" class="demo-box"></div>
                        </div>
                        <div class="form-group" id="pilsu">
                            <fieldset class="must-item">
                                <legend><span style="color: red;"><b>*</b></span> 는 필수 입력 사항 입니다.</legend>
                            </fieldset>
                        </div>
                        <div class="form-group">
                            <input class="form-control login-control" type="submit" id="signup_btn" name="signup_btn" value="회원가입">
                        </div>
                        <div class="form-group">
                            <input class="form-control login-control" type="reset" id="reset_btn" name="reset_btn" value="취소">
                        </div>
                    </form>
                    <div class="d-flex form-foot">
                        <div class="p-2 mr-auto"><a href="login.jsp">로그인</a></div>
                        <div class="p-2"><a href="">계정 찾기</a></div>
                        <div class="p-2">|</div>
                        <div class="p-2"><a href="">비밀번호 찾기</a></div>
                    </div>
                </div>
            </div>
        </section>
        <footer class="container">
            Copyrigth <strong>© DoubleD.</strong> All rights reserced.
        </footer>
    </div>
    <script src="js/signup.js?ver=1"></script>
</body>
</html>