package t2_switchCase;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String grade;
		System.out.print("점수를 입력하세요: ");
		int jumsu = sc.nextInt();
		int jumsu1 = jumsu / 10;
		
		switch (jumsu1) {
			case 10:
			case 9: {
				grade = "A";
				break;
			}
			case 8: {
				grade = "B";
				break;
			}
			case 7: {
				grade = "C";
				break;
			}
			case 6: {
				grade = "D";
				break;
			}
			default:
				grade = "F";
		}
		
		System.out.println("입력된 점수는? " + jumsu);
		System.out.println("계산된 점수는? " + grade);
		
		
		sc.close();
		
	}
}
