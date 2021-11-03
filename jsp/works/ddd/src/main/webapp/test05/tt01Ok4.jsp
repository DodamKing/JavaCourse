<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!-- jsp액션태그를 이용한 vo객체 생성 -->
<jsp:useBean id="vo" class="test.Tt01VO"  />

<!-- 앞에서(tt01.jsp)넘겨준 값을 vo객체에 저장(setProperty)하자. -->
<jsp:setProperty name="vo" property="*"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>tt01Ok4.jsp</title>
  <%-- <%@ include file="../include/bs4.jsp" %> --%>
  <style>
    th, td {text-align: center;}
    th {background-color: gray;}
  </style>
</head>
<body>
<div class="container">
	<p><br/></p>
  <h2>회 원 정 보(tt01Ok4.jsp)</h2>
	<table class="table table-hover table-success">
	  <tr>
	    <th>아이디</th>
	    <td><jsp:getProperty name="vo" property="mid"/></td>
	  </tr>
	  <tr>
	    <th>비밀번호</th>
	    <td><jsp:getProperty name="vo" property="pwd"/></td>
	  </tr>
	  <tr>
	    <th>성명</th>
	    <td><jsp:getProperty name="vo" property="name"/></td>
	  </tr>
	  <tr>
	    <th>나이</th>
	    <td><jsp:getProperty name="vo" property="age"/></td>
	  </tr>
	  <tr>
	    <th>성별</th>
	    <td><jsp:getProperty name="vo" property="gender"/></td>
	  </tr>
	  <tr>
	    <th>주소</th>
	    <td><jsp:getProperty name="vo" property="address"/></td>
	  </tr>
	  <tr>
	    <td colspan="2"><a href="<%=request.getContextPath()%>/test6/tt01.jsp">돌아가기</a></td>
	  </tr>
	</table>
</div>
</body>
</html>