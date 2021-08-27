package t2_max_min;

import java.util.Scanner;

// two read 방식
public class Test2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int su, max, min;
		System.out.print("수를 입력하세요(종료: 999): ");
		su = scanner.nextInt();
		max = min = su;
		
		while (true) {
			System.out.print("수를 입력하세요(종료: 999): ");
			su = scanner.nextInt();
			
			if (su != 999) {
				if (max < su) max = su;
				else if (min > su) min = su;
			}
			else break;			
		}
		System.out.println("max: " + max + ", min: " + min);
		System.out.println("END");
		scanner.close();
		
	}
}
