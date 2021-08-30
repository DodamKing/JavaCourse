package t2_array;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int[] jumsu = new int[5]; // 정수형 배열 선언, 매개변수는 배열의 길이
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<5; i++) { // 반복문을 이용한 입력
			System.out.printf("%d번째 점수를 입력하세요: ", i+1);
			jumsu[i] = sc.nextInt();
		}
		System.out.println();
//		jumsu[0] = 100;
//		jumsu[1] = 80;
//		jumsu[2] = 90;
//		jumsu[3] = 70;
//		jumsu[4] = 60;
		
		for (int i=0; i<5; i++) {
			System.out.printf("jumsu[%d]: %d\n", i, jumsu[i]); // 반복문을 이용한 출력
			
		}
		
		sc.close();
	}
}
