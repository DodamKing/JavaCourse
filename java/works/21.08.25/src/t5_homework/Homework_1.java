package t5_homework;

import java.util.Scanner;

public class Homework_1 {
	public static void main(String[] args) {
		
		// (문제1) 두수를 입력받아 큰수와 작은수를 출력하시오
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요: ");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 수를 입력하세요: ");
		int num2 = scanner.nextInt();
		
		int max = (num1 > num2) ? num1 : num2;
		int min = (num1 > num2) ? num2 : num1;
		System.out.println("큰수는 " + max + "이고, 작은수는 " + min + "입니다." );
		
		scanner.close();
		
	}
}
