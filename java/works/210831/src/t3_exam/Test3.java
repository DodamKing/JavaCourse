package t3_exam;

import java.util.Scanner;

// 학생 성명/국어/영어/수학 값을 입력 받아
// 총점/평균/학점/순위 구하기 학생은 30이내
// 번호	성명	국어	영어	수학 총점 평균	학점	순위
// 100  90  80
// 100 100  80
// 100  90  80
// 인원수
// 최고 총점
// 평균


public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] nameGrade = new String[30][2];
		int[][] jumsu = new int[30][5]; // 국영수총순
		double[] avg = new double[30];
		String[] title = {"성명", "국어", "영어", "수학"};
		int cnt=0;
		
		// 입력
		while (true) {
			System.out.printf("%s을 입력하세요: ", title[0]);
			nameGrade[cnt][0] = scanner.next();
			if (nameGrade[cnt][0].equals("999")) break;
			
			for (int i=0; i<3; i++) {
				System.out.printf("%s점수 입력: ", title[i+1]); //국영수 넣기
				jumsu[cnt][i] = scanner.nextInt();
				jumsu[cnt][3] += jumsu[cnt][i]; // 총점 넣기 
			}
			
			avg[cnt] = jumsu[cnt][3] / 3.0;
			
			// 학점 구하기
			switch ((int) avg[cnt]/10) {
				case 10:
				case 9: {
					nameGrade[cnt][1] = "A";
					break;
				}
				case 8: {
					nameGrade[cnt][1] = "B";
					break;
				}
				case 7: {
					nameGrade[cnt][1] = "C";
					break;
				}
				case 6: {
					nameGrade[cnt][1] = "D";
					break;
				}
				default: nameGrade[cnt][1] = "F";
			}
			cnt++;
		}
		// 순위 구하기
		for (int i=0; i<cnt; i++) jumsu[i][4] = 1;
		for (int i=0; i<cnt; i++) {
			for (int j=i+1; j<cnt; j++) {
				if (jumsu[i][3] > jumsu[j][3]) jumsu[j][4]++;
				if (jumsu[i][3] < jumsu[j][3]) jumsu[i][4]++;
			}
		}
		// 출력
		System.out.println("========================================================================================");
		System.out.println("번호\t성명\t국어\t영어\t수학\t총점\t평균\t학점\t순위");
		System.out.println("========================================================================================");
		for (int i=0; i<cnt; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\n", i+1, nameGrade[i][0],
					jumsu[i][0], jumsu[i][1], jumsu[i][2], jumsu[i][3], avg[i], nameGrade[i][1], jumsu[i][4]);
		}
		System.out.println("=========================================================================================");
		System.out.println("총인원수: " + cnt);
		
		System.out.println("=========================================================================================");
		scanner.close();
	}
		
		
}

