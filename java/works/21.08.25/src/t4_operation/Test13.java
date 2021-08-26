package t4_operation;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2;
		
		System.out.print("첫번째 수를 입력하세요: ");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		su2 = sc.nextInt();
		
		String res;
		res = (su1 % su2 == 1) || (su1 % su2 == 3) ? "남자" : (su1 % su2 == 2) || (su1 % su2 == 4) ? "여자" : "오류";
		
		System.out.printf("첫번째 수 : %d, 두번째 수 : %d\n", su1, su2);
		System.out.println("성별 : " + res);
		
		sc.close();
		
	}
}
