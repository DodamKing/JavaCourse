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
	TicketVO vo = new TicketVO();
	ArrayList<TicketVO> vos = new ArrayList<TicketVO>();
	
	public TicketDAO() {
		String url = "jdbc:mysql://localhost:3306/cinema";
		String id = "atom";
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
	
	public void ticketingSave(TicketVO vo) {
		sql = "insert into ticket values (?, ?, ?, ?, ?, ?, ?, ?, ?, default)";
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
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String getName(String mid) {
		sql = "select customerNm from ticket where customerID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int countTicket(String customerID) {
		sql = "select count(*) from ticket where customerID = ? and visible = 1";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customerID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; 
	}
	
	public ArrayList<TicketVO> show(String customerID){
		sql = "select * from ticket where customerID = ? and visible = 1 order by reserveDate desc";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customerID);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				TicketVO vo = new TicketVO();
				vo.setCustomerNm(rs.getString(1));
				vo.setCustomerID(rs.getString(2));
				vo.setTheatherNm(rs.getString(3));
				vo.setMovieNm(rs.getString(4));
				vo.setDay(rs.getString(5));
				vo.setTime(rs.getString(6));
				vo.setReserveDate(rs.getString(7));
				vo.setCost(rs.getString(8));
				vo.setPerson(rs.getString(9));
				vo.setVisible(rs.getInt(10));
				vos.add(vo);
				System.out.println(vo);
			}
			System.out.println(vos);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vos;
	}
}
