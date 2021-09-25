package project;

import java.util.ArrayList;
import java.util.Scanner;

public class HoewonService {
	HoewonDAO dao = new HoewonDAO();
	HoewonVO vo = new HoewonVO();
	Scanner scanner = new Scanner(System.in);
	
	public void hInput() {
		String mid;
		while (true) { // 아이디 중복 체크 후 vo에 저장
		System.out.print("아이디: "); 
		mid = scanner.next();
//		vo.setMid(mid);
		vo = dao.idCheck(mid);
		if (vo.getMid() == null) { 
		break;
		}
		else System.out.println("message: 중복된 아이디 입니다. 다시 입력해 주세요.");
		}
		
		// vo에 저장
		vo.setMid(mid);
		System.out.print("비밀번호: "); vo.setPwd(scanner.next());
		System.out.print("성명: "); vo.setName(scanner.next());
		System.out.print("나이: "); vo.setAge(scanner.nextInt());
		System.out.print("주소: "); vo.setAddress(scanner.next());
		
		// db에 올림
		dao.hInput(vo);
		System.out.println("message: 회원 가입이 정상 처리 되었습니다.");
	}

	public void hSearch() {
		System.out.print("회원 아이디를 입력하세요: "); 
		vo = dao.idCheck(scanner.next());
		if (vo.getMid() == null) {
			System.out.println("message: 아이디를 다시 확인해 주세요.");
		}
		else {
			System.out.println("===============================================");
			System.out.println("고유번호\t아이디\t비밀번호\t성명\t나이\t주소\t포인트");
			System.out.println("  " + vo.getIdx() + "\t" + vo.getMid() + "\t" + vo.getPwd() + "\t" + vo.getName() + "\t" + vo.getAge() + "\t" + vo.getAddress() + "\t" + vo.getPoint());
			System.out.println("===============================================");
		}
	}

	public void hList() {
		ArrayList<HoewonVO> hoewonVOs = dao.hList();
		System.out.println("===============================================");
		System.out.println("고유번호\t아이디\t비밀번호\t성명\t나이\t주소\t포인트");
		for (HoewonVO vo : hoewonVOs) {
			System.out.println("  " + vo.getIdx() + "\t" +  vo.getMid() + "\t" +  vo.getPwd() + "\t" +  vo.getName() + "\t" +  vo.getAge() + "\t" +  vo.getAddress() + "\t" +vo.getPoint());
		}
		System.out.println("===============================================");
	}

	public void hDelete() {
		System.out.println("---------삭제-----------");
		System.out.print("삭제할 회원 아이디를 입력하세요: ");
		String mid = scanner.next();
		vo = dao.idCheck(mid);
		if (vo.getMid() == null) System.out.println("message: 아이디를 다시 확인해 주세요.");
		else {
			dao.hDelete(mid);
			System.out.println("message: 삭제가 정상 처리 되었습니다.");
		}
	}

	public void hUpdate() {
		System.out.println("------------ 수  정 ------------ ");
		System.out.print("수정할 회원 아이디를 입력하세요: ");
		String mid = scanner.next();
		vo = dao.idCheck(mid);
		if (vo.getMid() == null) System.out.println("message: 아이디를 다시 확인해 주세요.");
		else {
			System.out.println("수정할 항목을 선택하세요(3~6).");
			System.out.println("|3.비밀번호 | 4.성명 | 5.나이 | 6.주소|");
			System.out.print("선택> "); int no = scanner.nextInt();
			if (no == 3) {
				System.out.print("비밀번호: "); vo.setPwd(scanner.next());
				dao.hUpadte(mid, "pwd", vo.getPwd());
			}
			if (no == 4) {
				System.out.print("성명: "); vo.setName(scanner.next());
				dao.hUpadte(mid, "name", vo.getName());
			}
			if (no == 5) {
				System.out.print("나이: "); vo.setAge(scanner.nextInt());
				dao.hUpadte(mid, "age", String.valueOf(vo.getAge()));
			}
			if (no == 6) {
				System.out.print("주소: "); vo.setAddress(scanner.next());
				dao.hUpadte(mid, "address", vo.getAddress());
			}
			System.out.println("message: 수정 되었습니다.");
		}
	}
	
}
