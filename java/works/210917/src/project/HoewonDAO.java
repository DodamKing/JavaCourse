package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoewonDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "";
		
	public HoewonDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javacourse";
			String user = "atom";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패");
			e.printStackTrace();
		}
	}
	
	
	public void dbClose() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {}
		}
	}
	
	public void pstmtClose() {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {}
		}
	}
	
	public void rsClose() {
		if (rs != null) {
			try {
				rs.close();
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {}
		}
	}


	public HoewonVO idCheck(String mid) {
		HoewonVO vo = new HoewonVO();
		try {
			sql = "select * from hoewon where mid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid); // 1은 첫번째 물음표
			rs = pstmt.executeQuery();
			if (!rs.next()) {
				return vo;
			}
			else {
				vo.setIdx(rs.getInt("idx"));
				vo.setMid(mid);
				vo.setPwd(rs.getString("pwd"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setAddress(rs.getString("address"));
				vo.setPoint(rs.getInt("point"));
			}
		} catch (SQLException e) {
			System.out.println("SQL에러: " + sql);
			e.printStackTrace();
		} finally {
			rsClose();
		}
		return vo;
	}


	public void hInput(HoewonVO vo) { // 회원 등록
		try {
			sql = "insert into hoewon values (default, ?, ?, ?, ?, ?, default)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMid());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getAge());
			pstmt.setString(5, vo.getAddress());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("SQL에러: " + sql);
			e.printStackTrace();
		} finally {
			pstmtClose();
		}
	}


	public ArrayList<HoewonVO> hList() {
		ArrayList<HoewonVO> hoewonVOs = new ArrayList<HoewonVO>();
		try {
			sql = "select * from hoewon order by idx desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				HoewonVO vo = new HoewonVO();
				
				vo.setIdx(rs.getInt("idx"));
				vo.setMid(rs.getString("mid"));
				vo.setPwd(rs.getString("pwd"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setAddress(rs.getString("address"));
				vo.setPoint(rs.getInt("point"));
				
				hoewonVOs.add(vo);
			}
		} catch (Exception e) {
			System.out.println("SQL에러: " + sql);
			e.printStackTrace();
		} finally {
			rsClose();
		}
		return hoewonVOs;
	}


	public void hDelete(String mid) { // 수정 삭제
		try {
			sql = "delete from hoewon where mid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("SQL에러: " + sql);
			e.printStackTrace();
		} finally {
			pstmtClose();
		}
	}


	public void hUpadte(String mid, String column, String value) {
		try {
//			System.out.println(mid + column + value);
			if (column.equals("age")) {
				int age = Integer.parseInt(value);
				sql = "update hoewon set age=? where mid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, age);
				pstmt.setString(2, mid);
				pstmt.executeUpdate();
			}
			else {
				sql = "update hoewon set " + column + "=? where mid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, value);
				pstmt.setString(2, mid);
				pstmt.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println("SQL에러: " + sql);
			e.printStackTrace();
		} finally {
			pstmtClose();
		}
	}
	
	
}
