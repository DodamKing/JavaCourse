<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="t04Ok.jsp" name="myform" method="get">
		<p>사용가능한 컴퓨터 언어는?</p>
		<p>
			<input type="checkbox" name="language" value="JAVA">JAVA
			<input type="checkbox" name="language" value="DataBase">DataBase
			<input type="checkbox" name="language" value="HTML5">HTML5
			<input type="checkbox" name="language" value="CSS3">CSS3
			<input type="checkbox" name="language" value="JavaScript">JavaScript
			<input type="checkbox" name="language" value="jQuery">jQuery
			<input type="checkbox" name="language" value="JSP">JSP
			<input type="checkbox" name="language" value="aJax">aJax
			<input type="checkbox" name="language" value="SpringFrmaework">SpringFrmaework
		</p>
		<p>
			기타 가능 언어: <input type="text" name="otherLang">
		</p>
		<p>
			<input type="submit" value="전송">
			<input type="reset" value="취소">
		</p>
		
	</form>
</body>
</html>