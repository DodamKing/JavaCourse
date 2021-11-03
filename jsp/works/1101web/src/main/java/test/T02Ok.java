package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/T02Ok")
public class T02Ok extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String hakbun = request.getParameter("hakbun");
		String hakyun = request.getParameter("hakyun");
		if(hakyun.equals("기타")) hakyun = request.getParameter("hakyunOption");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		int intAvg = (int)(avg/10.0);
		char grade;
		
		switch(intAvg) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		
		PrintWriter out = response.getWriter();
		out.println("<h2>성적 확인</h2>");
		out.println("<br/>성명 : " + name);
		out.println("<br/>성별 : " + gender);
		out.println("<br/>학번 : " + hakbun);
		out.println("<br/>학년 : " + hakyun);
		out.println("<br/>국어 : " + kor);
		out.println("<br/>영어 : " + eng);
		out.println("<br/>수학 : " + mat);
		out.println("<br/>총점 : " + tot);
		out.println("<br/>평균 : " + avg);
		out.println("<br/>학점 : " + grade);
		out.println("<p><a href='"+request.getContextPath()+"/test4/t02.jsp'>돌아가기</a></p>");
	}
}
