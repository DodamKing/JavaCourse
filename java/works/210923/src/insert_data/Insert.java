package insert_data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt;
		ResultSet rs;
		String sql;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacourse", "atom", "1234");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		sql = "insert into bbs values (?, ?, ?, now(), ?, ?)";
		for (int i=0; i<100; i++) {
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, i+16);
				pstmt.setString(2, "테스트" + (i+1));
				pstmt.setString(3, "admin");
				pstmt.setString(4, "게시글 내용" + (i+1) + "\n\n내용내용내용" + (i+1));
				pstmt.setInt(5, 1);
				pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
