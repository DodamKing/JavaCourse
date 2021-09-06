package t2_inheritance;

import java.util.Scanner;

public class RunJava {
	public static void main(String[] args) {
		int su1, su2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수1 입력: ");
		su1 = scanner.nextInt();
		System.out.print("수2 입력: ");
		su2 = scanner.nextInt();
		ChildGa ga = new ChildGa(su1, su2);
		
		ga.calc();
		
		scanner.close();
		
		ChildGa gaA = new ChildGa(su1, su2, 5);
		gaA.area();
	}
}
