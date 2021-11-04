<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  String mid = "";

	Cookie[] cookies = request.getCookies();
	if(cookies != null) {
		for(int i=0; i<cookies.length; i++) {
			String strMid = cookies[i].getName();
			if(strMid.equals("cMid")) {
				mid = cookies[i].getValue();
				break;
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>t2_Login.jsp</title>
  <%@ include file="../include/bs4.jsp" %>
  <script>
    function fCheck() {
    	myform.submit();
    }
  </script>
  <style>
    th, td {
    	text-align: center;
    }
  </style>
</head>
<body>
<div class="container">
  <p><br/></p>
	<form name="myform" method="post" action="t2_LoginOk.jsp">
	  <table class="table table-bordered">
	    <tr>
	      <td colspan="2"><h3>로 그 인</h3></td>
	    </tr>
	    <tr>
	      <th>아이디</th>
	      <td><input type="text" name="mid" value="<%=mid %>" autofocus class="form-control"/></td>
	    </tr>
	    <tr>
	      <th>비밀번호</th>
	      <td><input type="password" name="pwd" class="form-control"/></td>
	    </tr>
	    <tr>
	      <td colspan="2">
	        <button type="button" onclick="fCheck()" class="btn btn-secondary">로그인</button> &nbsp; &nbsp;
	        <button type="reset" class="btn btn-secondary">취 소</button>
	      </td>
	    </tr>
	  </table>
	</form>
</div>
</body>
</html>