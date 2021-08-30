package t2_array;

import java.util.Scanner;

// 최대 과목수 20, 학생당 총점, 평균, 학점
public class Test8 {
	public static void main(String[] args) {
		// 선언
		Scanner Scanner = new Scanner(System.in);
		int[] jumsu = new int[20];
		int tot = 0, i = 0;
		double avg;
		String grade;
		
		//입력
		for (i=0; i<jumsu.length; i++) {
			System.out.printf("%d번째 과목 점수는(종료는 999): ", i+1);
			jumsu[i] = Scanner.nextInt();
			if (jumsu[i] == 999) break;
			tot += jumsu[i];
		}

		
		
		
		// 처리
		avg = (double) tot / i;
		
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
//		System.out.print("입력받은 점수는(%d번째 과목): ", );
		for (int j=0; j<i; j++) System.out.printf("입력받은 점수는(%d번째 과목): %d/", j+1, jumsu[j]);
		
//		System.out.println(Integer.join("/ ", jumsu)); 리스트를 문자열로 바꿔야 join 가능함
		
		System.out.println();
		System.out.printf("총점: %d\n", tot);
		System.out.printf("평균: %.1f\n", avg);
		System.out.printf("학점: %s\n", grade);
		
		// 마무리
		Scanner.close();
	}
}
