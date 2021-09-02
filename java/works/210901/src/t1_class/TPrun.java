package t1_class;

import java.util.Scanner;

public class TPrun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, grade;
		int kor, eng, mat, total;
		double avg;
		int[] jumsu = new int[3];
		String[] title = {"국어", "영어", "수학"};
		TProcess tps = new TProcess();
		TPrint tpt = new TPrint();
		
		while(true) {
			System.out.print("성명을 입력하세요(종료999): ");
			name = scanner.next();
			if (name.equals("999")) break;
			for(int i=0; i<3; i++) {
				System.out.print(title[i] + "점수는: ");
				jumsu[i] = scanner.nextInt();
			}
			total = tps.total2(name, jumsu[0], jumsu[1], jumsu[2]);
			avg = tps.avg2(total);
			grade = tps.grade();
			tpt.print(name, jumsu[0], jumsu[1], jumsu[2], total, avg, grade);
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
