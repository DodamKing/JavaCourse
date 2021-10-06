package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VO.TicketVO;

public class TicketDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String sql;
	
	public TicketDAO() {
		String url = "jdbc:mysql://localhost:3306/java02_kdd";
		String id = "root";
		String pwd = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int ticketingSave(TicketVO vo) {
		sql = "insert into ticket values (default, ?, ?, ?, ?, ?, ?, ?, ?, ?, default)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getCustomerNm());
			pstmt.setString(2, vo.getCustomerID());
			pstmt.setString(3, vo.getTheatherNm());
			pstmt.setString(4, vo.getMovieNm());
			pstmt.setString(5, vo.getDay());
			pstmt.setString(6, vo.getTime());
			pstmt.setString(7, vo.getReserveDate());
			pstmt.setString(8, vo.getCost());
			pstmt.setString(9, vo.getPerson());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public String getName(int idt) {
		sql = "select customerNm from ticket where idt = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idt);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countTicket(String mid) {
		sql = "select count(*) from ticket where customerID = ? and visible = 1";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; 
	}
	
	public ArrayList<TicketVO> show(String mid){
		ArrayList<TicketVO> vos = new ArrayList<TicketVO>();
		sql = "select * from ticket where customerID = ? and visible = 1 order by idt desc";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				TicketVO vo = new TicketVO();
				vo.setIdt(rs.getInt(1));
				vo.setCustomerNm(rs.getString(2));
				vo.setCustomerID(rs.getString(3));
				vo.setTheatherNm(rs.getString(4));
				vo.setMovieNm(rs.getString(5));
				vo.setDay(rs.getString(6));
				vo.setTime(rs.getString(7));
				vo.setReserveDate(rs.getString(8));
				vo.setCost(rs.getString(9));
				vo.setPerson(rs.getString(10));
				vo.setVisible(rs.getInt(11));
				vos.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vos;
	}
	
	
	public String getMovieNm(int idt) {
		sql = "select movieNm from ticket where idt = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idt);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int delTicket(int idt) {
		sql = "update ticket set visible = 0 where idt = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; // 뭔가 잘못
	}

	public int ticketingUpdate(TicketVO vo) {
		sql = "update ticket set theatherNm = ?, movieNm = ?, day = ?, time =?, cost = ?, person = ? where idt = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTheatherNm());
			pstmt.setString(2, vo.getMovieNm());
			pstmt.setString(3, vo.getDay());
			pstmt.setString(4, vo.getTime());
			pstmt.setString(5, vo.getCost());
			pstmt.setString(6, vo.getPerson());
			pstmt.setInt(7, vo.getIdt());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; //잘못 됬지롱
	}

	public int getLastIdt(String mid) {
		sql = "select idt from ticket where customerID = ? order by idt desc";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
			return 0; // 없음
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; // 오류
	}
	
}
