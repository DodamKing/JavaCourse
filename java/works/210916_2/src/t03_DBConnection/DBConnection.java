package t03_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	Connection conn = null;
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버를 찾았습니다.");
			
			String url = "jdbc:mysql://localhost:3306/sample2";
			String user = "atom";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 검색 할 수 없습니다.");
//			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
	
	public void dbClose() {
		try {
			conn.close();
			System.out.println("데이터베이스가 닫혔습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
