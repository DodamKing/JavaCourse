package t1_sample;

import java.util.Scanner;

// 시작단과 끝단을 입력 받아
// 시작단이 작은 값
public class Test11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("시작단을 입력하세요: ");
			int start = scanner.nextInt();
			
			System.out.print("끝단을 입력하세요: ");
			int end = scanner.nextInt();
			
			if (start < end) {
				for (int i=start; i<=end; i++) {
					System.out.printf("%d단 출력\n", i);
					
					for (int j=1; j<10; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i*j);	
					}
					System.out.println("------------");
					System.out.println();
				}
			}
			else {
				System.out.println("잘못됬다."); 
				break;			
			}
		}
		System.out.println("END");
		
		scanner.close();
	}
}
