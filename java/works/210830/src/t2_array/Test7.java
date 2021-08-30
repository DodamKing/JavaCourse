package t2_array;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		// 선언
		Scanner Scanner = new Scanner(System.in);
		int[] jumsu = new int[5];
		int tot = 0;
		double avg;
		String grade;
		
		//입력
		for (int i=0; i<5; i++) {
			System.out.printf("%d번째 과목 점수는: ", i+1);
			jumsu[i] = Scanner.nextInt();
			tot += jumsu[i];
		}

		System.out.print("입력받은 점수는:");
		for (int jum : jumsu) System.out.printf(" %d/", jum);
		
//		System.out.println("join(/ , jumsu)");
		
		
		// 처리
		avg = tot / jumsu.length;
		
		int intAvg = (int) avg / 10;
		switch(intAvg) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
		}
		
		
		// 출력
		System.out.println();
		System.out.printf("총점: %d\n", tot);
		System.out.printf("평균: %.2f\n", avg);
		System.out.printf("학점: %s\n", grade);
		
		// 마무리
		Scanner.close();
	}
}
