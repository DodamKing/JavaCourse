package t03_DBConnection;

import java.util.Scanner;

public class DBConnection3Run {
	public static void main(String[] args) {
		DBConnection3 conn = new DBConnection3(); // 객체 생성치 db연결
//		System.out.println("DB 처리중입니다.");
		
		String sch;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("작업선택");
			System.out.println("1.자료입력 | 2.개별조회 | 3.전체조회 | 4.수정 | 5.삭제 | 6.종료");
			System.out.print("선택> ");
			sch = scanner.next();
			if (sch.equals("6")) break;
			
			if (sch.equals("1")) {
				System.out.print("아이디을 입력하세요: ");
				String mid = scanner.next();
				System.out.print("성명을 입력하세요: ");
				String name = scanner.next();
				System.out.print("나이를 입력하세요: ");
				int age = scanner.nextInt();
				System.out.print("주소를 입력하세요: ");
				String address = scanner.next();
				conn.input(mid, name, age, address);
			}
			if (sch.equals("2")) {
				while (true) {
					System.out.print("검색할 이름을 입력하세요: ");
					sch = scanner.next();
					conn.search(sch);
					System.out.print("계속 하시려면 아무키나 누르세요. 종료(q)");
					sch = scanner.next();
					if (sch.toLowerCase().equals("q")) break;
				}
			}
			if (sch.equals("3")) {
				conn.list();
			}
			if (sch.equals("4")) {
				conn.procSearch("U");
			}
			if (sch.equals("5")) {
				conn.procSearch("D");
//				conn.delete();
			}
			
		}
		
		System.out.println();
		conn.dbClose();
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
