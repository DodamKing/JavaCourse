package t04_hwk;

import java.util.Scanner;

public class Hwk_DBConnectorRun {
	public static void main(String[] args) {
		Hwk_DBConnector dbConnector = new Hwk_DBConnector();
		String input;
		int idx, age;
		String name="", mid="", password="", gender="", address="";
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("+-------------------------------------------------------+");
			System.out.println("| 1.자료입력 | 2.개별조회 | 3.전체조회 | 4.수정 | 5.삭제 | 6.종료 |");
			System.out.println("+-------------------------------------------------------+");
			System.out.print("선택> ");
			input = scanner.next();
			if (input.equals("6")) break;
			
			if (input.equals("1")) {
				System.out.print("성명을 입력하세요: ");
				name = scanner.next();
				System.out.print("아이디를 입력하세요: ");
				mid = scanner.next();
				System.out.print("비밀번호 입력하세요: ");
				password = scanner.next();
				System.out.print("나이를 입력하세요: ");
				age = scanner.nextInt();
				System.out.print("성별을 입력하세요: ");
				gender = scanner.next();
				System.out.print("주소를 입력하세요: ");
				address = scanner.next();
				dbConnector.insert(name, mid, password, age, gender, address);
			}
			if (input.equals("2")) {
				while (true) {
					System.out.print("조회할 아이디를 입력하세요: ");
					mid = scanner.next();
					dbConnector.inquiry(mid);
					System.out.print("계속 하시려면 아무키나 누르세요. 종료(q)");
					input = scanner.next();
					if (input.toLowerCase().equals("q")) break;
				}
			}
			if (input.equals("3")) {
				dbConnector.info();
			}
			if (input.equals("4")) {
				System.out.print("자료를 수정합니다. 아이디를 입력하세요: ");
				mid = scanner.next();
				dbConnector.update(mid);
			}
			if (input.equals("5")) {
				System.out.print("삭제할 아이디를 입력하세요: ");
				mid = scanner.next();
				dbConnector.delete(mid);
			}
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
		
	}
}
