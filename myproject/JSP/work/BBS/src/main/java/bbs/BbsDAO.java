package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDAO {
	private Connection conn;
//	private PreparedStatement pstmt;  // 오류발생 why?
	private ResultSet rs;
	
	String sql;
	
	public BbsDAO() {
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
	
	public int getEndBbsID() { // 게시글 번호 부여
		sql = "select bbsID from bbs order by bbsID desc";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("bbsID") + 1;
			}
			return 1; // 첫번째 게시물
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; // 데이터베이스 오류
	}
	
	// 글쓰기 게시글 생성
	public int write (String bbsTitle, String userID, String bbsContent) {
		sql = "insert into bbs values (?, ?, ?, now(), ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getEndBbsID());
			pstmt.setString(2, bbsTitle);
			pstmt.setString(3, userID);
			pstmt.setString(4, bbsContent);
			pstmt.setInt(5, 1); // 0 삭제된 글, 1 유효번호
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return -1; // 데이터베이스 오류
	}
	
	public ArrayList<Bbs> getBbsList(int pageNumber){
		sql = "select * from bbs where bbsID < ? and bbsAvailable = 1 order by bbsID desc limit 10";
		ArrayList<Bbs> bbsList = new ArrayList<Bbs>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getEndBbsID() - (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserID(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				bbsList.add(bbs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  
		return bbsList;
	}
	
	public boolean nextPage(int pageNumber) {
		sql = "select * from bbs where bbsID < ? and bbsAvailable = 1";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, getEndBbsID() - (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
	}
}
