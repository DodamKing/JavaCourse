package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HoewonDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	HoewonVO vo = null;
	
	String sql = "";
	
	public HoewonDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javacourse";
			String user = "atom";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동실패!");
		}
	}
	
	// 데이터베이스 Close
	// Connection객체 close
	public void dbClose() {
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {}
	}
	
	// PrepareadStatement객체 close
	public void pstmtClose() {
		if(pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {}
	}
	
	// RresultSet객체 close
	public void rsClose() {
		if(rs != null)
			try {
				rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {}
	}

	// 아이디 중복체크
	public HoewonVO idCheck(String mid) {
		try {
			sql = "select * from hoewon where mid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			if(rs.next()) {	// 같은 아이디를 갖는 자료가 있다.
				vo = new HoewonVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setMid(mid);
				vo.setPwd(rs.getString("pwd"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setAddress(rs.getString("address"));
				vo.setPoint(rs.getInt("point"));
			}
			else {  // 찾는 아이디가 없으면(아이디가 중복되지 않았다.) true를 넘긴다.
				return null;
			}
		} catch (SQLException e) {
			System.out.println("SQL에러 : " +e.getMessage() + " : " + sql);
		} finally {
			rsClose();
		}
		return vo;
	}

	// 회원등록
	public void hInput(HoewonVO vo) {
		try {
			sql = "insert into hoewon values (default,?,?,?,?,?,default)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMid());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getAge());
			pstmt.setString(5, vo.getAddress());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage() + " : " + sql);
		} finally {
			pstmtClose();
		}
	}

	// 전체회원조회
	public ArrayList<HoewonVO> hList() {
		ArrayList<HoewonVO> vos = new ArrayList<HoewonVO>();
		
		try {
			sql = "select * from hoewon order by idx desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new HoewonVO();
				
				vo.setIdx(rs.getInt("idx"));
				vo.setMid(rs.getString("mid"));
				vo.setPwd(rs.getString("pwd"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setAddress(rs.getString("address"));
				vo.setPoint(rs.getInt("point"));
				
				vos.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage() + " : " + sql);
		} finally {
			rsClose();
		}
		return vos;
	}

	// 회원 정보 수정하기
	public void update(String mid, String item, String value) {
		//System.out.println("mid="+mid+",item="+item+",value="+value);
		try {
			if(item.equals("age")) {
				int age = Integer.parseInt(value);
				sql = "update hoewon set "+item+"=? where mid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, age);
				pstmt.setString(2, mid);
			}
			else {
				sql = "update hoewon set "+item+"=? where mid=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, value);
				pstmt.setString(2, mid);
			}
			//System.out.println("sql : " + sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage() + " : " + sql);
		} finally {
			pstmtClose();
		}
	}

	// 회원 정보 삭제처리
	public void hDelete(String mid) {
		try {
			sql = "delete from hoewon where mid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage() + " : " + sql);
		} finally {
			pstmtClose();
		}
	}
}
