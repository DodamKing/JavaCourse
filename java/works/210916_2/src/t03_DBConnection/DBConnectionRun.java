package t03_DBConnection;

public class DBConnectionRun {
	public static void main(String[] args) {
		DBConnection conn = new DBConnection();
		System.out.println("DB 처리중입니다.");
		
		conn.dbClose();
	}
}
