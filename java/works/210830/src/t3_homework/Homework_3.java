package t3_homework;

import java.util.Scanner;

// (문제3) 100명 이하의 학생점수(국어/영어/수학)를 입력받아서 '총점/평균/학점/순위'를 구하되, 출력은 총점 내림차순으로 출력하시오.
public class Homework_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = new String[] {"국어", "영어", "수학"};
		int[] total = new int[100];
		String[] grade_arr = new String[100];
		int[][] score = new int[100][3];
		int[] rank = new int[100];
		int cnt=0, tot=0, temp=0;
		String grade;
		main : for (int i=0; i<score.length; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("%d번째 학생의 %s 점수를 입력하세요(종료시 999): ", i+1, subject[j]);
				score[i][j] = sc.nextInt();
				if (score[i][j] == 999) break main;
			}
			cnt++;
		}
		
		for (int i=0; i<cnt; i++) { // 총점 구하기
			for (int j=0; j<3; j++) tot += score[i][j];
			total[i] = tot;
			tot=0;
		}
		
		for (int i=0; i<cnt-1; i++) { // 버블소트(총점 내림차순)
			for (int j=0; j<cnt-1; j++) {
				if (total[j] < total[j+1]) {
					temp = total[j]; total[j] = total[j+1]; total[j+1] = temp;
				}
			}
		}
		
		for (int i=0; i<cnt; i++) { // 학점 구하기
			switch (total[i]/30) {
				case (10):
				case (9): {
					grade = "A";
					break;
				}
				case (8): {
					grade = "B";
					break;
				}
				case (7): {
					grade = "C";
					break;
				}
				case (6): {
					grade = "D";
					break;
				}
				default: grade = "F";
			}
			grade_arr[i] = grade;
		}
		
		for (int i=0; i<cnt; i++) rank[i] = 1; // 순위 배열 초기화
		
		for (int i=0; i<cnt; i++) { // 순위 조정
			for (int j=0; j<cnt; j++) {
				if (total[i] < total[j]) rank[i]++;
			}
		}
		
		
		System.out.println();
		for (int i=0; i<cnt; i++) System.out.printf("총점: %d, 평균: %.1f, 학점: %s, 순위: %d\n", total[i], total[i]/3.0, grade_arr[i], rank[i]);
		
		sc.close();
	}
}
