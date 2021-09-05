package t93_review2;

// 석차를 추가한 프로그램을 작성
import java.util.Scanner;

public class SungjukRun {
	static SungjukVO[] student = new SungjukVO[100];
	static int studentIndex = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SungjukService Ser = new SungjukService();
		String name="";
		int no=0, kor, eng, mat, rank;
		
		while(true) {
			student[studentIndex] = new SungjukVO();
			System.out.printf("이름을 입력해 주세요(종료q): ");
			name = scanner.next();
			if (name.equals("q")) break;
			else student[studentIndex].setName(name);
			
			System.out.print("학번을 입력하세요: ");
			no = scanner.nextInt();
			student[studentIndex].setNo(no);
			
			while(true) {
				System.out.printf("국어 점수를 입력해 주세요: ");
				kor = scanner.nextInt();
				if(student[studentIndex].getJumsuCheck(kor)) {
					student[studentIndex].setKor(kor);
					break;
				}
			}	
			
			while(true) {
				System.out.printf("영어 점수를 입력해 주세요: ");
				eng = scanner.nextInt();
				if(student[studentIndex].getJumsuCheck(eng)) {
					student[studentIndex].setEng(eng);
					break;
				}
			}
			
			while(true) {
				System.out.printf("수학 점수를 입력해 주세요: ");
				mat = scanner.nextInt();
				if(student[studentIndex].getJumsuCheck(mat)) {
					student[studentIndex].setMat(mat);
					break;
				}
			}
			student[studentIndex].setTot(Ser.getTot(kor, eng, mat));
			
			student[studentIndex].setAvg(Ser.getAvg());
			
			student[studentIndex].setGrade(Ser.getGrade());
			
			studentIndex++;
		}
		
		Ser.getRank();
		
		for (int i=0; i<studentIndex; i++) {
			System.out.printf("학번: %d, 이름: %s, 총점: %d, 평균: %.2f, 학점: %s, 순위: %d\n", student[i].getNo(), student[i].getName(), student[i].getTot(), student[i].getAvg(), student[i].getGrade(), student[i].getRank()); 
		}
		
		scanner.close();
	}
}
