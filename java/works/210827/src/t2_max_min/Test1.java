package t2_max_min;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int su, max = 0;
		
		while (true) {
			System.out.print("수를 입력해 주세요(종료: 999): ");
			su = scanner.nextInt();
		
			if (su == 999) break;
			if (su > max) max = su;
		}
		
		System.out.println("가장 큰 수는: " + max);
		
		scanner.close();
	}
}
