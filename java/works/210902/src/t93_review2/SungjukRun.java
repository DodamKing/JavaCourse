package t93_review2;

// 석차를 추가한 프로그램을 작성
import java.util.Scanner;

public class SungjukRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SungjukVO vo = new SungjukVO();
		String name="";
		int kor, eng, mat;
		
		System.out.printf("이름을 입력해 주세요: ");
		name = scanner.next();
		
		while(true) {
			System.out.printf("국어 점수를 입력해 주세요: ");
			kor = scanner.nextInt();
			if(vo.getJumsuCheck(kor)) {
				vo.setKor(kor);
				break;
			}
		}	
		
		while(true) {
			System.out.printf("영어 점수를 입력해 주세요: ");
			eng = scanner.nextInt();
			if(vo.getJumsuCheck(eng)) {
				vo.setEng(eng);
				break;
			}
		}
		
		while(true) {
			System.out.printf("수학 점수를 입력해 주세요: ");
			mat = scanner.nextInt();
			if(vo.getJumsuCheck(mat)) {
				vo.setMat(mat);
				break;
			}
		}
		
		System.out.println("성명: " + name);
		System.out.println("총점: " + vo.getTot());
//		double avg = vo.getAvg();
//		System.out.println("평균: " + avg);
//		
//		SungjukService service = new SungjukService();
//		System.out.println("학점: " + service.getGrade(avg));
		
		
		scanner.close();
	}
}
