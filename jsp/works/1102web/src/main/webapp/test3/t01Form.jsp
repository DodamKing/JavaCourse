<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t01Form.jsp</title>
</head>
<body>
	<form name="myform" method="post" action="t01.jsp">
		<p>성명 : <input type="text" name="name" value="홍길동"/></p>
		<p>가격 : <input type="number" name="amount" value="10000"/></p>
		<p><input type="submit" value="전송"/></p>
	</form>
</body>
</html>