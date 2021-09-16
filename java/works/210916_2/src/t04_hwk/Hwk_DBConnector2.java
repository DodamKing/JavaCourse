package t04_hwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Hwk_DBConnector2 {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	int idx, age;
	String name="", mid="", password="", gender="", address="";
	String sql = "";
	public Hwk_DBConnector2() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("찾기성공");
			
			String url = "jdbc:mysql://localhost:3306/javacourse";
			String user = "atom";
			String pwd = "1234";
			conn = DriverManager.getConnection(url, user, pwd);
//			System.out.println("연결성공");
		} catch (Exception e) {
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
	
	// 1. 자료입력
	public void insert(String name, String mid, String password, int age, String gender, String address) {
		try {
			stmt = conn.createStatement();
			sql = "insert into user values (default, '" + name + "', " + "'" + mid + "', '" + password + "', " + age + ", '" + gender + "', '"  + address + "')";
			stmt.executeLargeUpdate(sql);
			System.out.println("자료가 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			System.out.println("실패!" + e.getMessage() + ": " + sql);
			e.printStackTrace();
		} finally {
			stmtClose();
		}

	}
	
	// 2. 검색
	public void inquiry(String mid) {
		try {
			stmt = conn.createStatement();
			sql = "select * from user where mid='" + mid + "'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				idx = rs.getInt("idx");
				name = rs.getString("name");
				mid = rs.getString("mid");
				password = rs.getString("password");
				age = rs.getInt("age");
				gender = rs.getString("gender");
				address = rs.getString("address");
				
				System.out.println("+===================================================+");
				System.out.println("|고유번호\t 아이디\t  성명\t 비밀번호\t 나이\t 성별 \t주소 |");
				System.out.println("|---------------------------------------------------|");
				System.out.println("|  " + idx + "\t"+ mid + "\t  "+ name + "\t  " + password + "\t " + age + "\t "+ gender + "\t" + address + " |");
				System.out.println("+===================================================+");
			}
			else System.out.println("검색 결과가 없습니다.");
			
			
		} catch (Exception e) {
			System.out.println("실패!" + e.getMessage() + ": " + sql);
			e.printStackTrace();
		} finally {
			rsClose();
		}
	}
	
	// 3. 조회
	public void info() {
		try {
			stmt = conn.createStatement();
			sql = "select * from user order by idx desc";
			rs = stmt.executeQuery(sql);
			
			System.out.println("+===================================================+");
			System.out.println("|고유번호\t 아이디\t  성명\t 비밀번호\t  나이\t 성별 \t주소 |");
			while (rs.next()) {
				idx = rs.getInt("idx");
				name = rs.getString("name");
				mid = rs.getString("mid");
				password = rs.getString("password");
				age = rs.getInt("age");
				gender = rs.getString("gender");
				address = rs.getString("address");
				System.out.println("|---------------------------------------------------|");
				System.out.println("|  " + idx + "\t"+ mid + "\t "+ name + "\t  " + password + "\t  " + age + "\t "+ gender + "\t" + address + " |");
			}
			System.out.println("+===================================================+");
		} catch (Exception e) {
			System.out.println("실패!" + e.getMessage() + ": " + sql);
			e.printStackTrace();
		} finally {
			rsClose();
		}
	}

	// 4. 수정
	public void update(String mid, String password) {
		try {
			stmt = conn.createStatement();
			sql = "select * from user where mid='" + mid + "'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				sql = "select * from user where mid='" + mid + "' and password='" + password + "'";
				rs = stmt.executeQuery(sql);
				if (rs.next()) {
					System.out.println("사용자 정보를 변경 합니다.");
					System.out.print("이름: ");
					name = new Scanner(System.in).next();
					System.out.print("아이디: ");
					String mid2 = new Scanner(System.in).next();
					System.out.print("비밀번호: ");
					password = new Scanner(System.in).next();
					System.out.print("나이: ");
					age = new Scanner(System.in).nextInt();
					System.out.print("성별: ");
					gender = new Scanner(System.in).next();
					System.out.print("주소: ");
					address = new Scanner(System.in).next();
					
					stmt = conn.createStatement();
					sql = "update user set name='" + name + "', mid='" + mid2 + "', password='" + password + "', age=" + age + ", gender='" + gender + "', address='" + address+ "' where mid='" + mid + "'";
					stmt.executeUpdate(sql);
					System.out.println("성공적으로 수정 되었습니다.");
				}
				else System.out.println("비밀번호를 잘못 입력하였습니다.");
			}
			else System.out.println("아이디가 잘못 됬거나 없는 아이디 입니다.");
		} catch (Exception e) {
			System.out.println("실패!" + e.getMessage() + ": " + sql);
			e.printStackTrace();
		} finally {
			rsClose();
		}
	}

	//  5.삭제
	public void delete(String mid, String password) {
		try {
			stmt = conn.createStatement();
			sql = "select * from user where mid='" + mid + "'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				sql = "select * from user where mid='" + mid + "' and password='" + password + "'";
				rs = stmt.executeQuery(sql);
				if (rs.next()) {
					sql = "delete from user where mid='" + mid + "'";
					stmt.executeUpdate(sql);
					System.out.println("성공적으로 삭제 되었습니다.");
				}
				else System.out.println("비밀번호를 잘못 입력하였습니다.");
			}
			else System.out.println("아이디가 잘못 됬거나 없는 아이디 입니다.");
			
		} catch (Exception e) {
			System.out.println("실패!" + e.getMessage() + ": " + sql);
			e.printStackTrace();
		} finally {
			rsClose();
		}
	}

	// 아이디 중복 검사
	public boolean idCheck(String mid) {
		try {
			stmt = conn.createStatement();
			sql = "select * from user where mid='" + mid + "'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				System.out.println("중복된 아이디 입니다.");
				return true;
			}
		} catch (Exception e) {
			System.out.println("실패!" + e.getMessage() + ": " + sql);
			e.printStackTrace();
		} finally {
			rsClose();
		}
		return false;
	}
}
