package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VO.CustomerVO;

public class CustomerDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String sql;
	CustomerVO vo = new CustomerVO();
	
	public CustomerDAO() {
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
	
	public int login (String customerID, String password) { // 1 로그인, 0 비밀번호, -1아이디, -2디비오류
		sql = "select password from customer where customerID=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customerID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(password)) {
					return 1;
				}
				else return 0;
			}
			return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -2;
	}
	
	public int register(CustomerVO vo) {
		sql = "insert into customer values (?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getCustomerID());
			pstmt.setString(3, vo.getPassword());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getPhoneNum());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public CustomerVO setCustomer(String customerID) {
		sql = "select * from customer where customerID=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customerID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setName(rs.getString(1));
				vo.setCustomerID(rs.getString(2));
				vo.setPassword(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setPhoneNum(rs.getString(5));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getName(String mid) {
		sql = "select name from customer where customerID = ?";
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
}
