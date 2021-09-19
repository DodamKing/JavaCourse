package t03_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "";
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버를 찾았습니다.");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacourse", "atom", "1234");
			System.out.println("데이터베이스에 성공적으로 연결 하였습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 검색 할 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		}
	}
}
