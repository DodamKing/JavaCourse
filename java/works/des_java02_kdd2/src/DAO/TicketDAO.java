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
	
	private String sql;
	
	public TicketDAO() {
		PreparedStatement pstmt;
		String url = "jdbc:sqlite:save.db";
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
			sql = "CREATE TABLE if not exists ticket ('idt' integer NOT NULL DEFAULT 'auto_increment', 'customerNm' VARCHAR(50) NOT NULL, 'customerID' VARCHAR(50) NOT NULL, 'theatherNm'VARCHAR(50) NOT NULL, 'movieNm' VARCHAR(50) NOT NULL, 'day' VARCHAR(50) NOT NULL, 'time' VARCHAR(50) NOT NULL, 'reserveDate' DATETIME NOT NULL, 'cost' VARCHAR(50) NOT NULL, 'person' VARCHAR(50) NOT NULL, 'visible' integer DEFAULT 1, PRIMARY KEY(idt))";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int ticketingSave(TicketVO vo) {
		PreparedStatement pstmt = null;
		sql = "insert into ticket values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, 1)";
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
		finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}
	
	public String getName(int idt) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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
		finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}
	
	public int countTicket(String mid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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
		finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1; 
	}
	
	public ArrayList<TicketVO> show(String mid){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vos;
	}
	
//	public Vector<TicketVO> getTickets(String mid){
//		Vector<TicketVO> vos = new Vector<TicketVO>();
//		sql = "select * from ticket where customerID = ? and visible = 1 order by reserveDate desc";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, mid);
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				TicketVO vo = new TicketVO();
//				vo.setCustomerNm(rs.getString(2));
//				vo.setCustomerID(rs.getString(3));
//				vo.setTheatherNm(rs.getString(4));
//				vo.setMovieNm(rs.getString(5));
//				vo.setDay(rs.getString(6));
//				vo.setTime(rs.getString(7));
//				vo.setReserveDate(rs.getString(8));
//				vo.setCost(rs.getString(9));
//				vo.setPerson(rs.getString(10));
//				vo.setVisible(rs.getInt(11));
//				vos.add(vo);
//				System.out.println(vo);
//			}
//			System.out.println(vos);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return vos;
//	}
	
	public String getMovieNm(int idt) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public int delTicket(int idt) {
		PreparedStatement pstmt = null;
		sql = "update ticket set visible = 0 where idt = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idt);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1; // 뭔가 잘못
	}

	public int ticketingUpdate(TicketVO vo) {
		PreparedStatement pstmt = null;
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
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1; //잘못 됬지롱
	}

	public int getLastIdt(String mid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1; // 오류
	}
}
