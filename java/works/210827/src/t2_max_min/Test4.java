package t2_max_min;

import java.util.Scanner;

// 초기값 지정 방식
// 입력자료 범위의 최대값을 min, 최소값을 max
// 스위칭 기법
public class Test4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int su, max=-99, min=99, sw=0;
//		System.out.print("수를 입력하세요(종료: 999): ");
//		su = scanner.nextInt();
//		max = min = su;
		
		while (true) {
			System.out.print("수를 입력하세요(종료: 999): ");
			su = scanner.nextInt();
			
			if (su != 999) {
				if (max < su) {
					max = su;
					if (sw == 0)
						if (min > su) {
							min = su;
							sw = 1;
						}
				}
				
				else if (min > su) min = su;
			}
			else break;			
		}
		System.out.println("max: " + max + ", min: " + min);
		System.out.println("END");
		scanner.close();
		
	}
}
