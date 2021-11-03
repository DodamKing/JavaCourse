<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t02.jsp(성적계산)</title>
  <script>
    // 학년 체크
  	function hakyunCheck(){
      let hakyun = myform.hakyun.value;
      if(hakyun == "기타") myform.hakyunOption.focus();
    }
    
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
      } else if (hakyun.value == "기타" && hakyunOption.value == "") {
    	  alert("기타란을 입력하세요?");
        hakyunOption.focus();
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
</head>
<body>
	<form name="myform" method="post" action="<%=request.getContextPath() %>/T02Ok">
		<p>성명 : <input type="text" name="name"/></p>
		<p>성별 : 
			<input type="radio" id="gender" name="gender" value="남자"/>남자
			<input type="radio" id="gender" name="gender" value="여자"/>여자
		</p>
		<p>학번 : <input type="number" name="hakbun" value="20210105"/></p>
		<p>학년 :
		  <select name="hakyun" onchange="hakyunCheck()">
		    <option value="1학년">1학년</option>
		    <option value="2학년">2학년</option>
		    <option value="3학년">3학년</option>
		    <option value="4학년">4학년</option>
		    <option value="기타">기타</option>
		  </select> &nbsp;
		  기타 : <input type="text" name="hakyunOption"/>
		</p> 
		<p>국어 : <input type="number" name="kor"/></p>
		<p>영어 : <input type="number" name="eng"/></p>
		<p>수학 : <input type="number" name="mat"/></p>
		<p>
		  <input type="button" value="전송" onclick="fCheck()"/>
		  <input type="reset" value="다시입력"/>
		</p>
		<input type="hidden" name="hostip" value="<%=request.getRemoteAddr()%>" />
	</form>
</body>
</html>