package t3_override;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		int x = scanner.nextInt();
		System.out.print("수를 입력하세요: ");
		int y = scanner.nextInt();
		
		ChildGa childGa = new ChildGa(x, y);
		childGa.mot1();
		childGa.mot2();
		childGa.motGaA();
		childGa.motGaB();
		System.out.println();
		
		childGa.circleArea(10);
		childGa.circleAreaP(10);
		scanner.close();
		
		childGa.fieldPrint(500);
	}
}
