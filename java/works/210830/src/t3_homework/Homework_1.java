package t3_homework;

import java.util.Scanner;

// (문제1) 100명 이하의 학생점수를 입력받아서 학점을 구하되, 출력은 점수 내림차순으로 출력하시오.
public class Homework_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[100]; // 학생 점수
		String[] grade_arr = new String[100]; //학생 학점
		String grade;
		int cnt = 0, temp = 0;
		for (int i=0; i<score.length; i++) { // 입력받아 배열 완성
			System.out.print("점수를 입력 하세요.(999종료): ");
			score[i] = sc.nextInt();
			if (score[i] == 999) break;
			cnt++;
		}
		
		for (int i=0; i<cnt-1; i++) { // 버블소트로 정렬 (총점 내림차순)
			for (int j=0; j<cnt-1; j++) {
				if (score[j] < score[j+1]) {
					temp = score[j]; score[j] = score[j+1]; score[j+1] = temp;
				}
			}
		}
		
		for (int i=0; i<cnt; i++) {
			switch (score[i] / 10) {
				case (10):
				case (9):{
					grade = "A";
					break;
				}
				case (8):{
					grade = "B";
					break;
				}
				case (7):{
					grade = "C";
					break;
				}
				case (6):{
					grade = "D";
					break;
				}
				default: grade = "F";	
			}
			grade_arr[i] = grade;
		}
		
		System.out.println();
		for (int i=0; i<cnt; i++) System.out.printf("점수는 %d이고 학점은 %s입니다.\n", score[i], grade_arr[i]);
		
		sc.close();
	}
}
