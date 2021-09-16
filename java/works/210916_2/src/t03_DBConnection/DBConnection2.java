package t03_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection2 {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	public DBConnection2() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 찾기
			System.out.println("드라이버를 찾았습니다.");
			
			String url = "jdbc:mysql://localhost:3306/sample2";
			String user = "atom";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, user, pwd); // db 연결
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 검색 할 수 없습니다.");
//			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
	
	public void dbClose() { // db 닫기
		try {
			conn.close();
			System.out.println("데이터베이스가 닫혔습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void search() { // 한 건의 자료 검색
		try {
			stmt = conn.createStatement(); // table을 읽어옴
			String sql = "select * from user where name='홍길동'";
			rs = stmt.executeQuery(sql); // row를 읽어옴
			
			if (rs.next()) {
				int idx = rs.getInt("idx");
				String mid = rs.getString("mid");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getNString("address");
				
				System.out.println("------------------------------");
				System.out.println("고유번호: " + idx);
				System.out.println("아이디: " + mid);
				System.out.println("성명: " + name);
				System.out.println("나이: " + age);
				System.out.println("주소: " + address);
				System.out.println("------------------------------");
			}
			else {
				System.out.println("검색된 자료가 없습니다.");
			}
			System.out.println("sql 처리 성공!!");
		} catch (SQLException e) {
			System.out.println("sql 처리 실패!!");
			e.printStackTrace();
		}
	}
}
