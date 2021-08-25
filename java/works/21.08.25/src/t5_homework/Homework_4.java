package t5_homework;

import java.util.Scanner;

public class Homework_4 {
	public static void main(String[] args) {
//		(문제4) 수를 입력받아 입력받은수가,
//		 3의 배수면 입력받은수에 30을 더하여 출력,
//		 5의 배수면 입력받은수에 50을 더하여 출력,
//		 7의 배수면 입력받은수에 70을 더하여 출력, 하고,
//		나머지는 입력받은 정수값을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int number = sc.nextInt();
		
		int result = (number % 3 == 0) ? (number + 30) : ((number % 5 == 0) ? (number + 50) : (number % 7 == 0) ? (number + 70) : number);
		System.out.println(result);
		
		sc.close();
		
	}
}
