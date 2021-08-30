package t2_array;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu;
		jumsu = new int[5];
		
		String[] subject = new String[] {"국어", "영어", "수학", "사회", "과학"};
		
		
		for (int i=0; i<5; i++) {
			System.out.printf("%s 점수를 입력하세요: ", subject[i]);
			jumsu[i] = sc.nextInt();
		}
		System.out.println();
		
		int j = 0;
		for (String i : subject) {
			System.out.printf("%s 점수는: %d\n", i, jumsu[j]);
			j++;
		}
		
		System.out.println();
		
		for (int i=0; i<jumsu.length; i++) {
			System.out.printf("%s 점수는: %d\n", subject[i], jumsu[i]);
		}
		
		sc.close();
	}
}
