package Project;

import java.util.Scanner;

public class HoewonRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		HoewonDAO dao = new HoewonDAO();
		HoewonService service = new HoewonService();
		
		boolean run = true;
		
		System.out.println("\t\t\t** 회 원 관 리 프 로 그 램 **");
		while(run) {
			System.out.println("===========================================================================");
			System.out.println("작업선택: 1.회원등록   2.회원조회   3.회원전체조회   4.회원정보수정   5.회원삭제   0.종료");
			System.out.println("===========================================================================");
			System.out.print(">> ");
			int no = scanner.nextInt();
			
			switch (no) {
				case 1:	// 회원등록 
					service.hInput();
					break;
				case 2:	// 회원 개별조회 
					service.hSearch();
					break;
				case 3:	// 회원 전체조회
					service.hList();
					break;
				case 4:	// 회원 정보수정 
					service.hUpdate();
					break;
				case 5:	// 회원 삭제 
					service.hDelete();
					break;
				default:
					run = false;
			}
		}
		
		System.out.println("==================================================");
		System.out.println("작업끝.....");
		scanner.close();
	}
}
