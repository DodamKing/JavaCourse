package t2_array;

import java.util.Scanner;

// 100명 이하 학생점수 입력 받아 학점
// 출력 총점 내림차순
public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		String grade;
		String[] gr = new String[100];
		int[] score = new int[100];
		for (int i=0; i<score.length; i++) {
			System.out.print("점수를 입력 하세요: ");
			score[i] = sc.nextInt();
			if (sc.nextInt() == 999) break;
		}
		
		for (int i=0; i<score.length-1; i++) {
			for (int j=0; j<score.length-1; j++) {
				if (score[j] > score[j+1]) temp = score[j]; score[j] = score[j+1]; score[j+1] = temp;
			}
		}
		
		for(int i=0; i<score.length; i++) {
			int sco = score[i] / 10;
			
			switch (sco) {
				case (10):
				case (9):{
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
			
			gr[i] = grade;
		}
		
		for (String g : gr) System.out.println(g);
		
		sc.close();
	}
}
