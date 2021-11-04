<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t05.jsp(MultiText Box사용)</title>
</head>
<body>
	<h2>상품 가격에 따른 정렬 처리</h2>
	<form name="myform" method="post" action="t08Ok.jsp">
		<p>상품1 : <input type="number" value="10" name="product" autofocus /></p>
		<p>상품2 : <input type="number" value="30" name="product"/></p>
		<p>상품3 : <input type="number" value="5" name="product"/></p>
		<p>상품4 : <input type="number" value="150" name="product"/></p>
		<p>상품5 : <input type="number" value="33" name="product"/></p>
		<p>상품6 : <input type="number" value="50" name="product"/></p>
		<p>
		  <input type="submit" value="전송"/>
		  <input type="reset" value="취소"/>
		</p>
	</form>
</body>
</html>