package hoewon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HoewonDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	HoewonVO vo;
	String sql;
	
	public HoewonDAO() {
		try {
			String url = "jdbc:mysql://localhost:3306/sample2";
			String id = "atom";
			String password = "1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 없음");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		}
	}
	
	public void Close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			Connection conn;
		}
		
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			PreparedStatement pstmt;
		}
		
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ResultSet rs;
		}
	}

	public void hoewonInput(HoewonVO vo) {
		sql = "insert into hoewon values (default, ?, ?, ?)"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getAddress());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(sql);
		}
		Close();
	}
	
	
}
