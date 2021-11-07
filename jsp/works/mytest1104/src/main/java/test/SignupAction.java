package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Signup")
public class SignupAction extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String userId = "";
		String password = "";
		String userNm = "";
		
		if (request.getParameter("userId") != null) {
			userId = request.getParameter("userId");
		}
		if (request.getParameter("password") != null) {
			password = request.getParameter("password");
		}
		if (request.getParameter("userNm") != null) {
			userNm = request.getParameter("userNm");
		}
		
		LoginDAO dao = new LoginDAO();
		PrintWriter out = response.getWriter();

		if (dao.idCheck(userId) == -1) {
			out.println("<script>");
			out.println("alert('중복된 아이디 입니다.')");
			out.println("history.back()");
			out.println("</script>");
		}
		
		else {
			LoginVo vo = new LoginVo();
			vo.setUserId(userId);
			vo.setPassword(password);
			vo.setUserNm(userNm);
			
			int res = dao.signUp(vo);
			
			if (res == -1) {
				out.println("<script>");
				out.println("alert('DB 문제')");
				out.println("history.back()");
				out.println("</script>");
			}
			else {
				out.println("<script>");
				out.println("alert('" + userNm + "님 환영합니다. 정상적으로 가입 되었습니다.')");
				out.println("location.href = '" + request.getContextPath() + "/main.jsp'");
				out.println("</script>");
			}
		}
	}
}
