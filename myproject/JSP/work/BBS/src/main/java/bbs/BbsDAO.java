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
		sql = "select * from bbs where bbsAvailable = 1 order by bbsID desc limit ?, 10";
		ArrayList<Bbs> bbsList = new ArrayList<Bbs>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (pageNumber - 1) * 10);
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
	
	public ArrayList<Bbs> getMyBbsList(String userID, int pageNumber){
		sql = "select * from bbs where userID =? and bbsAvailable = 1 order by bbsID desc limit ?, 10";
		ArrayList<Bbs> myBbsList = new ArrayList<Bbs>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userID);
			pstmt.setInt(2, (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserID(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				myBbsList.add(bbs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  
		return myBbsList;
	}
	
	public boolean nextPage(int pageNumber) {
		sql = "select * from bbs where bbsAvailable = 1 order by bbsID desc limit ?, 10";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	public boolean myNextPage(String userID, int pageNumber) {
		sql = "select * from bbs where userID = ? and bbsAvailable = 1 order by bbsID desc limit ?, 10";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userID );
			pstmt.setInt(2, (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	public Bbs getBbs (int bbsID) { // 해당 게시글 조회
		sql = "select * from bbs where bbsID=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bbsID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(bbsID);
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserID(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				return bbs;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int update (String bbsTitle, String bbsContent, int bbsID) {
		sql = "update bbs set bbsTitle = ?, bbsContent = ? where bbsID = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bbsTitle);
			pstmt.setString(2, bbsContent);
			pstmt.setInt(3, bbsID);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int delete (int bbsID) {
		sql = "update bbs set bbsAvailable = 0 where bbsID = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bbsID);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int getCount () { // 삭제되지 않은 게시글 총 개수
		sql = "select count(*) from bbs where bbsAvailable = 1";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; // 오류
	}
	
	public int getMyCount (String UserID) { 
		sql = "select count(*) from bbs where userID = ? and bbsAvailable = 1";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, UserID);
			rs = pstmt.executeQuery();
			if (rs.next()) return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; // 오류
	}
	
	public int getSrchCount (String srchKey, String srchText) { 
		sql = "select count(*) from bbs where bbsAvailable = 1 and " + srchKey + " like ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + srchText + "%");
			rs = pstmt.executeQuery();
			if (rs.next()) return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1; // 오류
	}
	
	public ArrayList<Bbs> getSrchList (String srchKey, String srchText, int pageNumber) {
		ArrayList<Bbs> searchList = new ArrayList<Bbs>();
		sql = "select * from bbs where bbsAvailable = 1 and " + srchKey + " like ? order by bbsID desc limit ?, 10";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + srchText + "%");
			pstmt.setInt(2, (pageNumber - 1) * 10);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Bbs bbs = new Bbs();
				bbs.setBbsID(rs.getInt(1));
				bbs.setBbsTitle(rs.getString(2));
				bbs.setUserID(rs.getString(3));
				bbs.setBbsDate(rs.getString(4));
				bbs.setBbsContent(rs.getString(5));
				bbs.setBbsAvailable(rs.getInt(6));
				searchList.add(bbs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return searchList;
	}
	
	public boolean srchNextPage(String srchKey, String srchText, int pageNumber) {
		sql = "select * from bbs where bbsAvailable = 1 and " + srchKey + " like ? order by bbsID desc limit ?, 10";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + srchText + "%");
			pstmt.setInt(2, (pageNumber - 1) * 10);
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
