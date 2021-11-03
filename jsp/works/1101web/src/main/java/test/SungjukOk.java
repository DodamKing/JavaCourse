package test;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SungjukOk")
public class SungjukOk extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String hakbun = request.getParameter("hakbun");
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
		
//		name = URLEncoder.encode(name);
//		gender = URLEncoder.encode(gender);
		
		SungjukVO vo = new SungjukVO(name, gender, hakbun, kor, eng, mat, tot, avg, grade);
		System.out.println(vo);
//		response.sendRedirect(request.getContextPath() + "/1103/sungjukResult.jsp?vo=" + vo);
	
		request.setAttribute("vo", vo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/1103/sungjukResult.jsp");
		dispatcher.forward(request, response);
	}
}
