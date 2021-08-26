package t1_ifTest;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int su1, su2;
		
		System.out.print("첫번째 수를 입력하세요: ");
		su1 = scanner.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		su2 = scanner.nextInt();
		
		int max, min;
		
		if (su1 > su2) { //실행내용이 한줄 일 때는 {} 없이 한줄로 가능 if (조건문) 실행문
			max = su1;
			min = su2;
		}
		else {
			max = su2;
			min = su1;
		}
		
		System.out.printf("입력된 두 수: %d, %d\n", su1, su2);
		System.out.println("max : " + max + "\nmin : " + min);
		
		scanner.close();
	}
}
