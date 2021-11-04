<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>title</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
			<h2>거듭제곱 구하기</h2>
			<form method="post" action="t06Ok.jsp">
				<p>
					수: <input type="number" name="su" value="1" min="1"><br>
					거듭제곱: <input type="number" name="exp" value="1" min="1"><br>
					<input type="submit" name="su" value="계산"><br>
			</form>
	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>