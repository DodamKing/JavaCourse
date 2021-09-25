package project;

import java.util.Scanner;

public class HoewonRun {
	public static void main(String[] args) {
		HoewonDAO dao = new HoewonDAO();
		HoewonService service = new HoewonService();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.println("\t\t\t************회원관리 프로그램************");
		while (run) {
			System.out.println("==============================================================================================");
			System.out.println("작업선택: 1.회원등록 | 2.회원조회 | 3.회원전체조회 | 4.회원정보수정 | 5. 회원삭제 | 0.종료");
			System.out.println("==============================================================================================");
			System.out.print("선택> ");
			int no = scanner.nextInt();
			
			if (no == 0) run = false;
			if (no == 1) {
				service.hInput();
			}
			if (no == 2) {
				service.hSearch();
			}
			if (no == 3) {
				service.hList();
			}
			if (no == 4) {
				service.hUpdate();
			}
			if (no == 5) {
				service.hDelete();
			}
		}
		
		scanner.close();
		System.out.println("=====================================");
		System.out.println("프로그램을 종료합니다.");
	}
}
