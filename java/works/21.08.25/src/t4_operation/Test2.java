package t4_operation;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("몸무게를 입력하세요: ");
		double weight = sc.nextDouble();
				
		System.out.printf("입력하신 이름은 %s입니다.\n", name);
		System.out.printf("입력하신 나이는 %d입니다.", age);
		System.out.printf("입력하신 몸무게는 %.2f입니다.\n", weight);
		
		
		sc.close();
		
	}
}
