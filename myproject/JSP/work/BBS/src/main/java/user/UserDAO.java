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
		Check check = new Check();
		int cr = check.check(user); 
		sql = "insert into user values (NULL, ?, ?, ?, ?, ?, ?)";
		if (cr == -2) {
			return -2;
		}
		else if (cr == -3) {
			return -3;
		}
		else {
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
			return -1;
		}
	}
	
	public User profile(String mid) {
		User user = new User();
		sql = "select * from user where mid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setGender(rs.getString("gender"));
				user.setAge(rs.getInt("age"));
				user.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return user;
	}
	
	public void dropout(String mid) {
		sql = "delete from user where mid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void userUpdate(User user) {
		try {
			PreparedStatement temp = conn.prepareStatement("select * from user where mid=?");
			temp.setString(1, user.getMid());
			rs = temp.executeQuery();
			if (rs.next()) {
				if (user.getPassword() == null) user.setPassword(rs.getString("password"));
				if (user.getName() == null) user.setName("name");
				if (user.getAge() == 0) user.setAge(rs.getInt("age"));
				if (user.getGender() == null) user.setGender(rs.getString("gender"));
				if (user.getAddress() == null) user.setAddress(rs.getString("address"));
			}
			sql = "update user set password=?, name=?, age=?, gender=?, address=? where mid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getName());
			pstmt.setInt(3, user.getAge());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, user.getMid());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public String getName(String mid) {
		sql = "select name from user where mid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			if (rs.next()) return rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return "";
	}
	
//	public String search (String searchKey, String searchText) {
//		sql = "select * from user where name like %?%";
//		
//	}
}
