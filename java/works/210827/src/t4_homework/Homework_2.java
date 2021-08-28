package t4_homework;

import java.util.Scanner;

//(문제2) 다이아몬드 중앙의 수(홀수)를 입력받아 다이아몬드를 그리는 프로그램을 완성하시오.
//예)
//  다이아몬드 중앙의 숫자를 입력하세요? 9
//    *
//   ***
//  *****  
// *******
//*********
// *******
//  *****
//   ***
//    *

public class Homework_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("중앙 수를 입력하세요(홀수): ");
		int n = sc.nextInt();
		
		while(true) {
			if (n % 2 == 0) {
				System.out.print("홀수여야 합니다, 다시 입력해 주세요. ");
				n = sc.nextInt();
			}
			
			else {
				for (int i=1; i<=n/2+1; i++) {
					for (int j=1; j<=(n/2+1)-i; j++) {
						System.out.print(" ");
					}
					for (int j=1; j<=i*2-1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int i=1; i<=n/2+1; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(" ");
					}
					for(int j=1; j<=n-i*2 ; j++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
				break;
			}
			
		}
		sc.close();
	}
}
