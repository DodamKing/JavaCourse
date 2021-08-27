package t4_homework;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("크기를 입력하세요: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) System.out.println("짝수를 입력해애야 해요.");
		
		else {
			for (int i=1; i<=n/2+1; i++) {
				for (int j=1; j<=4-i; j++) {
					System.out.print(" ");
				}
				for (int j=1; j<=i*2-1; j++) {
					System.out.print("*");
				}
				for (int j=1; j<=4-i; j++) {
					System.out.print(" ");
				}
				
				System.out.println();
			}
			for (int i=1; i<=n/2; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=7-i*2 ; j++) {
					System.out.print("*");
				}
				for(int j=1; j<=i; j++) {
					System.out.print(" ");
				}
				
				System.out.println();
		}
		}
		sc.close();
	}
}
