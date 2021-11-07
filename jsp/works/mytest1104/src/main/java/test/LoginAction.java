package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginAction extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String mid = "";
		String password = "";
		String loginCheck = "";
		int res;
		LoginVo vo;
		
		if (request.getParameter("userId") != null) {
			mid = request.getParameter("userId");
		}
		
		if (request.getParameter("password") != null) {
			password = request.getParameter("password");
		}
		
		if (request.getParameter("loginCheck") != null) {
			loginCheck = request.getParameter("loginCheck");
		}
		
		LoginDAO dao = new LoginDAO();
		res = dao.loginCheck(mid, password);
		vo = dao.getVo(mid);
		
		PrintWriter out = response.getWriter();
		
		if (res == -2) {
			out.println("<script>");
			out.println("alert('DB 문제')");
			out.println("history.back()");
			out.println("</script>");
		}
		else if (res == -1) {
			out.println("<script>");
			out.println("alert('없는 아이디 입니다.')");
			out.println("history.back()");
			out.println("</script>");
		}
		else if (res == 0) {
			out.println("<script>");
			out.println("alert('비밀번호를 확인 하세요')");
			out.println("history.back()");
			out.println("</script>");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("sMid", mid);
			
			if (loginCheck.equals("true")) {
				Cookie cookie = new Cookie("cMid", mid);
				cookie.setMaxAge(60*60*24);
				response.addCookie(cookie);
			}
			else {
				Cookie kc = new Cookie("cMid", null);
				kc.setMaxAge(0);
				response.addCookie(kc);
			}
			
			String fDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
			int vCnt = vo.getvCnt() + 1;
			int point = vo.getPoint();
//			int maxCnt = 0;
			int cnt = 1;

			//쿠키 로직 시작
			Cookie[] cookies = request.getCookies();
			Cookie cookie;
			
//			if (LocalTime.now().getHour() == 0) {
//				if (cookies != null) {
//					for (int i=0; i<cookies.length; i++) {
//						cookies[i].setMaxAge(0);
//						response.addCookie(cookies[i]);
//					}
//				}
//			}
			
			if (cookies != null && cookies.length > 0) {
				for (int i=0; i<cookies.length; i++) {
					if(cookies[i].getName().equals("cToday_" + mid)) {
						cnt = Integer.parseInt(cookies[i].getValue()) + 1;
					}
				}
			}
			
			cookie = new Cookie("cToday_" + mid, Integer.toString(cnt));
			cookie.setMaxAge(60*60*24);
			response.addCookie(cookie);
			
//			cookie = new Cookie("maxCnt_" + mid, "0");
//			response.addCookie(cookie);
//			
//			if (cookies != null && cookies.length > 0) {
//				for (int i=0; i<cookies.length; i++) {
//					if(cookies[i].getName().equals("cToday_" + mid)) {
//						String strCnt = Integer.toString((Integer.parseInt(cookies[i].getValue()) + 1));
//						cookie = new Cookie("cToday_" + mid, strCnt);
//						cookie.setMaxAge(60*60*24);
//						response.addCookie(cookie);
//					}
//					
//					if(cookies[i].getName().equals("maxCnt_" + mid)) {
//						maxCnt = Integer.parseInt(cookies[i].getValue());
//					}
//				}
//			}
//			
			if (cnt < 6) {
				point += 50;
//				maxCnt++;
//				cookie = new Cookie("cToday_" + mid, Integer.toString(maxCnt));
//				cookie.setMaxAge(60*60*24);
//				response.addCookie(cookie);
			}
			 // 쿠키 로직 종료
			
			dao.loginBonus(mid, point, vCnt, fDate);
			
			out.println("<script>");
			out.println("alert('" + vo.getUserNm() + "님 로그인 되었습니다.')");
			out.println("location.href = '" + request.getContextPath() + "/main.jsp'");
			out.println("</script>");
		}
	}
	
}
