package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

@WebServlet("/T01Ok")
public class t01Ok extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		reponse.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String name = "";
		if (request.getParameter("name") != null) {
			name = request.getParameter("name");
		}
		String amount = request.getParameter("amount");
		
		PrintWriter out = reponse.getWriter();
		out.print("<br>성명:" + name);
		out.print("<br>입력가격:" + amount);
		out.print("<br>접속 IP:" + request.getParameter("hostip"));
		out.print("<br>전송방식:" + request.getMethod());
		out.print("<br>URL:" + request.getRequestURL());
		out.print("<br>사용자 IP:" + request.getRemoteAddr());
		out.print("<br>서버 이름:" + request.getServerName());
		out.print("<br>서버 포트:" + request.getServerPort());
		out.print("<br>요청 파라미터 길이:" + request.getContentLength());
		out.print("<br>컨텍스트 경로:" + request.getContextPath());
		out.print("<br>프로토콜:" + request.getProtocol());
		
		out.print("<br><a href='javascript:history.back()'>돌아가기</a>");
	}
}
