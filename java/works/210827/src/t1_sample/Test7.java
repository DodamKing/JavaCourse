package t1_sample;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		//구구단 n단 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요: ");
		int n = sc.nextInt();
		
		for (int i=1; i<10; i++) {
			int res = n * i;
			System.out.printf("%d * %d = %d\n", n, i, res);
		}
		
		
		sc.close();
	}
}
