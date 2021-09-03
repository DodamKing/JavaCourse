package t92_review;

// 석차를 추가한 프로그램을 작성
import java.util.Scanner;

public class SungjukRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no, kor, eng, mat;
		int[] student = new int[4];
		String name="";
		String[] title = {"학번", "국어", "영어", "수학", "총점", "평균", "학점"};
		
		System.out.printf("이름을 입력해 주세요: ");
		name = scanner.next();
		for (int i=0; i<4; i++) {
			System.out.print(title[i] + "을 입력하세요: ");
			student[i] = scanner.nextInt();
		}
		no = student[0]; kor = student[1]; eng = student[2]; mat = student[3];
		
		SungjukVO vo = new SungjukVO(no, name, kor, eng, mat);
		
		System.out.println("총점: " + vo.getTot());
		double avg = vo.getAvg();
		System.out.println("평균: " + avg);
		
		SungjukService service = new SungjukService();
		System.out.println("학점: " + service.getGrade(avg));
		
		
		scanner.close();
	}
}
