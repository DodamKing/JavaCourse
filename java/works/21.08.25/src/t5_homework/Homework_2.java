package t5_homework;

import java.util.Scanner;

public class Homework_2 {
	public static void main(String[] args) {
		
		// (문제2) '국어/영어/수학점수'를 입력받아, 평균을 구하고,
//		그 평균점수가
//		90점 이상은 'A학점',
//		80점 이상은 'B학점',
//		70점 이상은 'C학점',
//		60점 이상은 'D학점',
//		60점 미만은 'F학점' 이라고 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주세요: ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력해 주세요: ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 입력해 주세요: ");
		int math = sc.nextInt();
		
		int average = (korean + english + math) / 3;
		String score  = (average >= 90) ? "A학점" : ((average >= 80) ? "B학점": ((average >= 70) ? "C학점" : ((average >= 60) ? "D학점" : "F학점")));
		
		System.out.printf("당신의 평균 점수는 %d점이고, 학점은 %s입니다", average, score);
		
		sc.close();
	}
}
