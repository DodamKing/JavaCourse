package t2_max_min;

import java.util.Scanner;

// 초기값 지정 방식
// 입력자료 범위의 최대값을 min, 최소값을 max
public class Test3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int su, max=-99, min=99;
//		System.out.print("수를 입력하세요(종료: 999): ");
//		su = scanner.nextInt();
//		max = min = su;
		
		while (true) {
			System.out.print("수를 입력하세요(종료: 999): ");
			su = scanner.nextInt();
			
			if (su != 999) {
				if (max < su) max = su;
				if (min > su) min = su;
			}
			else break;			
		}
		System.out.println("max: " + max + ", min: " + min);
		System.out.println("END");
		scanner.close();
		
	}
}
