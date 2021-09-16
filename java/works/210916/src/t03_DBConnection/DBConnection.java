package t03_DBConnection;

public class DBConnection {
	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버를 찾았습니다.");
		} catch (Exception e) {
			System.out.println("드라이버를 검색 할 수 없습니다.");
			e.printStackTrace();
		}
	}
}
