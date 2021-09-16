package t03_DBConnection;

public class DBConnection2Run {
	public static void main(String[] args) {
		DBConnection2 conn = new DBConnection2();
		System.out.println("DB 처리중입니다.");
		
		DBConnection2.search();
		
		
		conn.dbClose();
	}
}
