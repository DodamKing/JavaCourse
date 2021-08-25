package t4_operation;

import java.util.Scanner;

// 두 정수를 입력받아 몫과 나머지를 구하시오.
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("첫번째 수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		b = sc.nextInt();
		
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n", a/b, a%b);
		
		sc.close();
		
	}
}
