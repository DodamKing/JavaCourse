package t2_array;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] jumsu = new int[5]; // 정수형 배열 선언, 매개변수는 배열의 길이
		int[] jumsu = new int[] {100, 90, 80, 70, 100}; 
		
//		for (int i=0; i<5; i++) { // 반복문을 이용한 입력
//			System.out.printf("%d번째 점수를 입력하세요: ", i+1);
//			jumsu[i] = sc.nextInt();
//		}
		
//		System.out.println();
		
//		for (int i=0; i<5; i++) {
//			System.out.printf("jumsu[%d]: %d\n", i, jumsu[i]); // 반복문을 이용한 출력
//		}
		for (int i=0; i<jumsu.length; i++) {
			System.out.printf("jumsu[%d]: %d\n", i, jumsu[i]); 
		}
		System.out.println("길이: " + jumsu.length);
		System.out.println();
		
		
		for (int i : jumsu) { // jumsu(객체명)에 있는 아이템 하나씩 i로
			System.out.println(i); 
		}
		System.out.println();
		
		int cnt = 1;
		for (int i : jumsu) { // jumsu(객체명)에 있는 아이템 하나씩 i로
			System.out.printf("%d번째는 %d\n", cnt, i);
//			System.out.printf("jumsu[%d] = %d\n", cnt-1, i);
			cnt++;
		}
		
		System.out.println();
		
		cnt = 1;
		for (int i : jumsu) { // jumsu(객체명)에 있는 아이템 하나씩 i로
//			System.out.printf("%d번째는 %d\n", cnt, i);
			System.out.printf("jumsu[%d] = %d\n", cnt-1, i);
			cnt++;
		}
		
		
		
		sc.close();
	}
}
