package t1_class;

import java.util.Scanner;

public class Test8_run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, gr;
		int kor, eng, mat, tot;
		double avg;
		int[] jumsu = new int[3];
		String[] title = {"국어", "영어", "수학"};
		Test8 t8 = new Test8();
		
		while(true) {
			System.out.print("성명을 입력하세요(종료999): ");
			name = scanner.next();
			if (name.equals("999")) break;
			for(int i=0; i<3; i++) {
				System.out.print(title[i] + "점수는: ");
				jumsu[i] = scanner.nextInt();
			}
			kor = jumsu[0];
			eng = jumsu[1];
			mat = jumsu[2];
			tot = t8.total2(name, kor, eng, mat);
			avg = t8.avg2(tot);
			System.out.printf("성명: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.1f\n\n", name, jumsu[0], jumsu[1], jumsu[2], tot, avg);
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
		
		
		// 추가...
		tot = t8.total2("이기자", 70, 80);
		System.out.println("메쏘드 오버로딩 추가 출력(tot): " + tot);
		
		
	}
}
