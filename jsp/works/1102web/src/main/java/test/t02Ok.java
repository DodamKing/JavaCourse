package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/T02Ok")
public class t02Ok extends HttpServlet {
	@Override
	protected void service(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		requset.setCharacterEncoding("utf-8");
		
		String ip = requset.getParameter("ip");
		String name = requset.getParameter("name");
		String hakbun = requset.getParameter("hakbun");
		String hakyun = requset.getParameter("hakyun");
		String hakyunOption = requset.getParameter("hakyunOption");
		int kor = Integer.parseInt(requset.getParameter("kor"));
		int eng = Integer.parseInt(requset.getParameter("eng"));
		int mat = Integer.parseInt(requset.getParameter("mat"));
		
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		int intAvg = (int) avg;
		char grade;
		
		switch (intAvg/10) {
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
		out.print("<h2> 성적 확인 </h2>");
		out.print("<br>성명: " + name);
		out.print("<br>학번: " + hakbun);
		if (hakyun.equals("기타")) {
			out.print("<br>학년: " + hakyunOption);
		}
		else {
			out.print("<br>학년: " + hakyun);
		}
		out.print("<br>국어: " + kor);
		out.print("<br>영어: " + eng);
		out.print("<br>수학: " + mat);
		out.print("<br>총점: " + tot);
		out.print("<br>평균: " + avg);
		out.print("<br>학점: " + grade);
		out.print("<br>아이피: " + ip);
		out.print("<p><a href='/1102web/test4/t02.jsp'>돌아가기</a></p>");
		out.print("<p><a href='" + requset.getContextPath() + "/test4/t02.jsp'>돌아가기</a></p>");
		
		out.print("<p><a href='http://localhost:9090/" + requset.getContextPath() + "/test4/t02.jsp'>리퀘스트로 돌아가기</a></p>");
		 
		out.print("<p><a href='javascript:history.back()'>히스토리백</a></p>");
		
	}
}
