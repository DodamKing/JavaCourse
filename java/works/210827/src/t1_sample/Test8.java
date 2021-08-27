package t1_sample;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		//구구단 n단 출력하기 999를 입력하면 종료
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.print("출력할 단을 입력하세요(종료: 999): ");
			int n = sc.nextInt();
			
			if (n == 999) break; //run == false;
			
			for (int i=1; i<10; i++) {
				int res = n * i;
				System.out.printf("%d * %d = %d\n", n, i, res);		
			}
			System.out.println();
		}
		
		sc.close();
	}
}
