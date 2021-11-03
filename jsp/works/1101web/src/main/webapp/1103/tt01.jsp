<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>tt01.jsp</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<p><br/></p>
	<h2>폼테그 값 전달방식</h2>
	<br/>
	<form name="myform" method="post" action="tt01Ok4.jsp">
		<p>아이디 : <input type="text" name="mid" class="form-control" autofocus value="hkd1234"/></p>
		<p>비밀번호 : <input type="password" name="pwd" class="form-control" value="1234"/></p>
		<p>성명 : <input type="text" name="name" class="form-control" value="홍길동"/></p>
		<p>나이 : <input type="number" name="age" class="form-control" value="23"/></p>
		<p>성별 : &nbsp;
			<input type="radio" name="gender" value="남자"/> 남자 &nbsp; &nbsp;
			<input type="radio" name="gender" value="여자" checked/> 여자
		</p>
		<p>주소 : <input type="text" name="address" class="form-control" value="서울"/></p>
		<p>
		  <input type="submit" value="전송" class="btn btn-success"/>
		  <input type="reset" value="다시입력" class="btn btn-success"/>
		</p>
	</form>
</div>
</body>
</html>