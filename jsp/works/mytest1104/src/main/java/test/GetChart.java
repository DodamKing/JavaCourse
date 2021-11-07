package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetChart")
public class GetChart extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		URL url = new URL("http://127.0.0.1:5000/");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST"); //변경 가능 (대문자)
		conn.setRequestProperty("Content-Type", "application/json");
		
		int responseCode = conn.getResponseCode();
		if (responseCode == 400) {
			System.out.println("400: 실행 안대여");
		}
		else if (responseCode == 401) {
			System.out.println("401: header가 잘못됨");
		}
		else if (responseCode == 405) {
			System.out.println("405: 405가 있을 줄이야");
		}
		else if (responseCode == 500) {
			System.out.println("500: 내가 잘못함 문법 확인");
		}
		else {
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line = "";
			while ((line = br.readLine()) != null ) {
				sb.append(line);
			}
//			JSONObject respnsejon = new JSONObject(sb.toString());
			System.out.println(sb);
			System.out.println(sb.toString());
		}
		
		
		
		
		
		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
		String name = (String) parameterNames.nextElement();
		System.out.println(name + "=" + request.getParameter(name));
		
		}
		
	}
}
