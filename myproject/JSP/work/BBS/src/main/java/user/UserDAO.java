package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	String sql;
	
	public UserDAO() {
		try {
			String url = "jdbc:mysql://localhost:3306/javacourse";
			String id ="atom";
			String password = "1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
	
	public int login (String mid, String password) {
		sql = "select password from user where mid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				if (rs.getString("password").equals(password)) 
					return 1; // 로그인 성공
				else return 0; // 비빌번호 불일치
			}
			return -1; // 아이디 없음
		} catch (Exception e) {
			System.out.println(sql);
			e.printStackTrace();
		}
		return -2; // 데이터베이스 오류
	}
	
	public int join(User user) {
		sql = "insert into user values (NULL, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement temp = conn.prepareStatement("select mid from user where mid=?");
			temp.setString(1, user.getMid());
			rs = temp.executeQuery();
			if (!rs.next()) {
				pstmt =conn.prepareStatement(sql);
				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getMid());
				pstmt.setString(3, user.getPassword());
				pstmt.setInt(4, user.getAge());
				pstmt.setString(5, user.getGender());
				pstmt.setString(6, user.getAddress());
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; // 아이디 중복
	}
}
