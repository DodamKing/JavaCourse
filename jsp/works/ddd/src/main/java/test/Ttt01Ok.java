package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ttt01Ok")
public class Ttt01Ok extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=utf-8");
//		response.setCharacterEncoding("utf-8");
//		request.setCharacterEncoding("utf-8");
		
		String mid = "";
		String pwd = "";
		String name = "";
		String gender = "";
		int age = 0;
		mid = request.getParameter("mid");
		pwd = request.getParameter("pwd");
		name = request.getParameter("name");
		gender = request.getParameter("gender");
		age = Integer.parseInt(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();
		out.print("<br>아이디: " + mid);
		out.print("<br>비밀번호: " + pwd);
		out.print("<br>성명: " + name);
		out.print("<br>성별: " + gender);
		out.print("<br>나이: " + age);
		out.print("<p><a href='" + request.getContextPath() + "/test7/ttt01.jsp'>돌아가기</a></p>");
	}
}
