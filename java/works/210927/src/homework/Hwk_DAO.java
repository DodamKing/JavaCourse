package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hwk_DAO {
	Connection conn;
	ResultSet rs;
	
	String sql;
	
	public Hwk_DAO() {
		String url = "jdbc:mysql://localhost:3306/javacourse";
		String id = "atom";
		String password = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(url, id, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int join(Hwk_VO vo) {
		sql = "insert into user_awt values(default, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserID());
			pstmt.setString(2, vo.getPassword());
			pstmt.setInt(3, vo.getAge());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getJob());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; // 아뒤 중복
	}
}
