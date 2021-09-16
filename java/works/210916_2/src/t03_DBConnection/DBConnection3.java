package t03_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection3 {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String sql ="";
	public DBConnection3() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 찾기
//			System.out.println("드라이버를 찾았습니다.");
			
			String url = "jdbc:mysql://localhost:3306/sample2";
			String user = "atom";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, user, pwd); // db 연결
//			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
//			System.out.println("드라이버를 검색 할 수 없습니다.");
//			e.printStackTrace();
		} catch (Exception e) {
//			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
	
	public void stmtClose() {
		try {
			if (stmt != null) stmt.close();
		} catch (Exception e) {}
	}
	
	public void rsClose() {
		try {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
		} catch (Exception e) {}
	}
	
	public void dbClose() { // db 닫기
		try {
			conn.close();
			System.out.println("데이터베이스가 닫혔습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void search(String sch) { // 한 건의 자료 검색
		try {
			stmt = conn.createStatement(); // table을 읽어옴
			sql = "select * from user where name='" + sch + "'";
			rs = stmt.executeQuery(sql); // row를 읽어옴
			
			if (rs.next()) {
				int idx = rs.getInt("idx");
				String mid = rs.getString("mid");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getNString("address");
				
				System.out.println("------------------------------");
				System.out.println("고유번호: " + idx);
				System.out.println("아이디: " + mid);
				System.out.println("성명: " + name);
				System.out.println("나이: " + age);
				System.out.println("주소: " + address);
				System.out.println("------------------------------");
			}
			else {
				System.out.println("검색된 자료가 없습니다.");
			}
//			System.out.println("sql 처리 성공!!");
		} catch (SQLException e) {
			System.out.println("sql 처리 실패!!");
			e.printStackTrace();
		}
		finally {
			rsClose();
		}
	}

	public void list() { // 3.전체조회
		try {
			stmt = conn.createStatement();
			sql = "select * from user order by idx desc";
			rs = stmt.executeQuery(sql);
			
			System.out.println("=========================================");
			System.out.println("고유번호\t 아이디\t  성명\t 나이\t 주소");
			System.out.println("-----------------------------------------");
			
			while (rs.next()) {
				int idx = rs.getInt("idx");
				String mid = rs.getString("mid");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getNString("address");
				
				System.out.println("  " + idx + "\t"+ mid + "\t "+ name + "\t "+ age + "\t "+ address );
				System.out.println("=========================================");
			}
		} catch (Exception e) {
			System.out.println("sql 처리 실패!!");
			e.printStackTrace();
		}
		finally {
			rsClose();
		}
	}

	public void input(String mid, String name, int age, String address) { // 1.자료입력
		try {
			stmt = conn.createStatement();
			sql = "insert into user values (default, '" + mid + "', " + "'" + name + "'," + age + ", " + "'" + address + "')";
			stmt.executeUpdate(sql);
			System.out.println("자료가 저장 되었습니다.");
		} catch (Exception e) {
			System.out.println("실패!" + e.getMessage() + ": " + sql);
			e.printStackTrace();
		}
		finally {
			stmtClose();
		}
	}

	public void procSearch(String str) { // 고유번호 조회
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("고유번호를 입력하세요: ");
			int idx = scanner.nextInt();
			
			stmt = conn.createStatement(); // table을 읽어옴
			sql = "select * from user where idx=" + idx;
			rs = stmt.executeQuery(sql); // row를 읽어옴
			
			if (rs.next()) {
				rsClose();
				
				stmt = conn.createStatement(); // table을 읽어옴
				
				if (str.equals("D")) {
					sql = "delete from user where idx=" + idx;
				}
				else {
					System.out.print("성명: ");
					String name = scanner.next();
					System.out.print("나이: ");
					String age = scanner.next();
					System.out.print("주소: ");
					String address = scanner.next();
					sql = "update user set name='" + name + "', age='" + age +"', address='" + address + "' where idx=" + idx;
				}
				stmt.executeUpdate(sql);
				
				System.out.println("------------------------------");
				System.out.println("자료를 삭제 하였습니다.");
				System.out.println("------------------------------");
			}
			else {
				System.out.println("검색된 자료가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("sql 처리 실패!!");
			e.printStackTrace();
		}
		finally {
			stmtClose();
//			scanner.close();
		}
	}
}
