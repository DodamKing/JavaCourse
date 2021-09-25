package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class HoewonService {
	Scanner scanner = new Scanner(System.in);
	
	HoewonDAO dao = new HoewonDAO();
	HoewonVO vo = new HoewonVO();
	
	String mid = "";
	
	// 회원 가입
	public void hInput() {
		// 아이디 중복체크
		String mid = "";
		while(true) {
			System.out.print("아이디 : "); mid = scanner.next();
			vo = dao.idCheck(mid);
			if(vo == null) break;	// 돌아온값이 true면 아이디는 중복되지 않았다.
			else System.out.println("회원아이디가 중복되었습니다.");
		}
		vo = new HoewonVO();
		vo.setMid(mid);
		System.out.print("비밀번호 : "); vo.setPwd(scanner.next());
		System.out.print("성명 : "); vo.setName(scanner.next());
		System.out.print("나이 : "); vo.setAge(scanner.nextInt());
		System.out.print("주소 : "); vo.setAddress(scanner.next());
		dao.hInput(vo);
		System.out.println("회원 가입되었습니다.");
	}

	// 개별조회
	public void hSearch() {
		while(true) {
			System.out.print("회원 아이디를 입력하세요?(종료시 0번) ");
			mid = scanner.next();
			if(mid.equals("0")) break;
			
			vo = dao.idCheck(mid);
			if(vo == null) {	// 검색한 아이디가 없으면...
				System.out.println("찾고자하는 아이디가 없습니다.");
			}
			else {	// 검색한 아이디를 찾았으면....
				System.out.println("==============================");
				System.out.println("1.고유번호 : " + vo.getIdx());
				System.out.println("2.아이디 : : " + vo.getMid());
				System.out.println("3.비밀번호 : " + vo.getPwd());
				System.out.println("4.성명 : " + vo.getName());
				System.out.println("5.나이 : " + vo.getAge());
				System.out.println("6.주소 : " + vo.getAddress());
				System.out.println("7.포인트 : " + vo.getPoint());
				System.out.println("==============================");
				break;
			}
		}
	}
	
	// 전체 회원 조회
	public void hList() {
		// 전체조회후 조회된 내용을 List로 출력한다.
		// 전체회원조회는 DB에서 처리해야 하므로 DAO에서 처리 시킨다.
		ArrayList<HoewonVO> vos = new ArrayList<HoewonVO>();
		vos = dao.hList();
		
		// 전체 조회한 내역을 가져와서 화면에 반복적으로 출력시켜준다.
		// vo = new HoewonVO();
		
		System.out.println("=====================================================");
		System.out.println("고유번호\t아이디\t비밀번호\t성명\t나이\t포인트\t주소");
		System.out.println("-----------------------------------------------------");
//		for(HoewonVO vo : vos) {
//			//System.out.println("vo : " + vo.toString());
//			System.out.print("  "+vo.getIdx()+"\t");
//			System.out.print(vo.getMid()+"\t");
//			System.out.print(vo.getPwd()+"\t");
//			System.out.print(vo.getName()+"\t");
//			System.out.print(vo.getAge()+"\t");
//			System.out.print(vo.getPoint()+"\t");
//			System.out.print(vo.getAddress()+"\t");
//			System.out.println();
//		}
		for(int i=0; i<vos.size(); i++) {
			vo = vos.get(i);
			System.out.print("  "+vo.getIdx()+"\t");
			System.out.print(vo.getMid()+"\t");
			System.out.print(vo.getPwd()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.print(vo.getPoint()+"\t");
			System.out.print(vo.getAddress()+"\t");
			System.out.println();
		}
		System.out.println("=====================================================");
	}

	// 회원 정보 수정하기
	public void hUpdate() {
		vo = new HoewonVO();
		boolean flag = true;
		
		hSearch();
		while(flag) {
			System.out.print("수정할 항목을 선택하세요?(3~6항목만 가능, 종료시 0번) ");
			int no = scanner.nextInt();
			switch(no) {
				case 0:		// 수정항목 종료...
					flag = false;
					break;
				case 3:
					System.out.print("비밀번호 : "); vo.setPwd(scanner.next());
					dao.update(mid, "pwd", vo.getPwd());
					break;
				case 4:
					System.out.print("성명 : "); vo.setName(scanner.next());
					dao.update(mid, "name", vo.getName());
					break;
				case 5:
					System.out.print("나이 : "); vo.setAge(scanner.nextInt());
					dao.update(mid, "age", String.valueOf(vo.getAge()));
					break;
				case 6:
					System.out.print("주소 : "); vo.setAddress(scanner.next());
					dao.update(mid, "address", vo.getAddress());
					break;
				default:
					System.out.println("수정가능항목? 3:비밀번호, 4:성명, 5:나이, 6:주소 , 0:종료");
			}
			
		}
	}

	// 회원정보삭제
	public void hDelete() {
		hSearch(); 		// 아이디 조회
		if(mid.equals("0")) return;
		
		dao.hDelete(mid);
		System.out.println("회원정보가 삭제되었습니다.");
	}

}
