<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>성적계산</title>
</head>

<body>
	<form action="<%=request.getContextPath()%>/T02Ok" method="post">
		<p>
			성명: <input type="text" name="name">
		</p>
		<p>
			성별 : <input type="radio" id="gender" name="gender" value="남자" checked />남자
			<input type="radio" id="gender" name="gender" value="여자" />여자
		</p>
		<p>
			학번 : <input type="number" name="hakbun" />
		</p>
		<p>
			학년 : <select name="hakyun">
				<option value="1학년" selected>1학년</option>
				<option value="2학년">2학년</option>
				<option value="3학년">3학년</option>
				<option value="4학년">4학년</option>
				<option value="기타">기타</option>
			</select> &nbsp; 기타 : <input type="text" name="hakyunOption" />
		</p>
		<p>
			국어: <input type="text" name="kor">
		</p>
		<p>
			영어: <input type="text" name="eng">
		</p>
		<p>
			수학: <input type="text" name="mat">
		</p>
		<p>
			<input type="button" value="전송" onclick="fCheck()"> <input
				type="reset" value="취소">
		</p>
		<p>
			<input type="hidden" name="ip" value="<%=request.getRemoteAddr()%>">
		</p>
	</form>
</body>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	function fCheck() {
		if($("select[name='hakyun']").val() == "기타") {
			$("input[name='hakyunOption']").focus();
			if ($("input[name='hakyunOption']").val() == "") {
				alert("학년을 입력하세요.");
				return;
			}
		}
		
		if ($("input[name='name']").val() == "") {
			alert("이름을 입력하세요.");
			$("input[name='name']").focus();
		} else if ($("input[name='hakbun']").val() == "") {
			alert("학번을 입력하세요.");
			$("input[name='hakbun']").focus();
		} else if ($("input[name='kor']").val() == "") {
			alert("국어 점수를 입력하세요.");
			$("input[name='kor']").focus();
		} else if ($("input[name='eng']").val() == "") {
			alert("영어 점수를 입력하세요.");
			$("input[name='eng']").focus();
		} else if ($("input[name='mat']").val() == "") {
			alert("수학 점수를 입력하세요.");
			$("input[name='mat']").focus();
		} else if ($("input[name='hakbun']").val() == "") {
			alert("학번을 입력하세요.");
			$("input[name='hakbun']").focus();
		} else {
			$("form").submit();
		}
	}
</script>

</html>