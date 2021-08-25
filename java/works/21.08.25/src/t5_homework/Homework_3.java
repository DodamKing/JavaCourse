package t5_homework;

import java.util.Scanner;

public class Homework_3 {
	public static void main(String[] args) {
//		(문제3) 수를 입력받아 입력받은 수가 짝수인지 홀수인지를 판별하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: " );
		int number = sc.nextInt();
		
		String result = (number % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("%d은(는) %s 입니다.", number, result);
		
		sc.close();
	}
}
