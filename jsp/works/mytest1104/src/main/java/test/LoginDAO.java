package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql;
	LoginVo vo;
	
	String url = "jdbc:mysql://localhost/javacourse";
	String id = "root";
	String pw = "1234";
	
	public LoginDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int loginCheck(String userId, String password) {
		sql = "select * from login_01 where userId='" + userId + "'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				if (rs.getString(3).equals(password)) {
					return 1;
				}
				return 0;
			}
			return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return -2;
	}
	
	public LoginVo getVo(String userId) {
		vo = new LoginVo();
		sql = "select * from login_01 where userId='" + userId + "'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo.setIdx(rs.getInt(1));
				vo.setUserId(rs.getString(2));
				vo.setPassword(rs.getString(3));
				vo.setUserNm(rs.getString(4));
				vo.setfDate(rs.getString(5));
				vo.setvCnt(rs.getInt(6));
				vo.setPoint(rs.getInt(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}
	
	public int signUp(LoginVo vo) {
		sql = "insert into login_01 values (default, '" + vo.getUserId() + "', '" + vo.getPassword() + "', '" + vo.getUserNm() + "', default, default, default)";
		try {
			stmt = conn.createStatement();
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return -1;
	}
	
	public int idCheck(String userId) {
		sql = "select * from login_01 where userId='" + userId + "'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public void loginBonus(String userId, int point, int vCnt, String fDate) {
		sql = "update login_01 set point=" + point + ", vCnt=" + vCnt + ", fDate='" + fDate + "' where userId='" + userId + "'";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public ArrayList<LoginVo> userList() {
		ArrayList<LoginVo> vos = new ArrayList<LoginVo>();
		sql = "select * from login_01";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				vo = new LoginVo();
				vo.setIdx(rs.getInt(1));
				vo.setUserId(rs.getString(2));
				vo.setPassword(rs.getString(3));
				vo.setUserNm(rs.getString(4));
				vo.setfDate(rs.getString(5));
				vo.setvCnt(rs.getInt(6));
				vo.setPoint(rs.getInt(7));
				
				vos.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vos;
	}
	
	public void logoutBonus(String userId, int point) {
		sql = "update login_01 set point=" + point + " where userId='" + userId + "'";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public void signOut(String userId) {
		sql = "delete from login_01 where userId='" + userId + "'";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}
}
