<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>title</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form name="myform" method="post" action="<%=request.getContextPath() %>/SungjukOk">
		<p>성명 : <input class="form-control" type="text" name="name" value="홍길동" autofocus required/></p>
		<p class="form-group"> 
			성별 :
			<input type="radio" id="gender" name="gender" value="남자" checked/>남자
			<input type="radio" id="gender" name="gender" value="여자"/>여자
		</p>
		<p>학번 : <input class="form-control" type="number" name="hakbun" value="20210105"/></p>
		<p>국어 : <input class="form-control" type="number" name="kor" value="100"/></p>
		<p>영어 : <input class="form-control" type="number" name="eng" value="90"/></p>
		<p>수학 : <input class="form-control" type="number" name="mat" value="80"/></p>
		<p>
		  <input class="btn btn-secondary" type="button" value="전송" onclick="fCheck()"/>
		  <input class="btn btn-secondary" type="reset" value="다시입력"/>
		</p>
	</form>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
    
    // 전송전에 모든 값을 체크
    function fCheck() {
      let name = myform.name;
      let gender = myform.gender;
      let hakbun = myform.hakbun;
      let hakyun = myform.hakyun;
      let hakyunOption = myform.hakyunOption;
      let kor = myform.kor;
      let eng = myform.eng;
      let mat = myform.mat;
 
      if(name.value == "") {
    	  alert("이름을 입력하세요?");
        /* alert(‎"이름을 입력하세요"); */
        name.focus();
      } else if (gender.value == "") {
    	  alert("성별을 입력하세요?");
      } else if (hakbun.value == "") {
    	  alert("학번을 입력하세요?");
        hakbun.focus();
      } else if (kor.value == "") {
    	  alert("국어점수를 입력하세요?");
        kor.focus();
      } else if (eng.value == "") {
    	  alert("영어점수를 입력하세요?");
        eng.focus();
      } else if (mat.value == "") {
    	  alert("수학점수를 입력하세요?");
        mat.focus();
      } else {
    	  myform.submit();
      }
    }
  </script>
	
</body>
</html>