package t1_sample;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 단을 출력 할까요: ");
		int n = scanner.nextInt();
		
		for (int i=2; i<10; i++) {
			System.out.printf("%d단 출력\n", i);
			
			for (int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);	
			}
			System.out.println("------------");
			System.out.println();
		}
		System.out.println("END");
		
		scanner.close();
	}
}
