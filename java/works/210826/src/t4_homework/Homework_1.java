package t4_homework;

import java.util.Scanner;

//(문제1) 사다리꼴의 면적을 구하시오?(출력값은 소수이하 1자리까지 출력한다.)
//단, 입력받는 값은 '아랫변/윗변/높이'를 입력받는다.
//입력값는 아랫변의 값이 999이면 작업을 종료하시오.
//사다리꼴 면적 공식  = (아랫변+윗변) * 높이 / 2
public class Homework_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("아랫변의 길이를 입력하세요: (999를 입력하면 프로그램이 종료 됩니다.)");
			int a = sc.nextInt();
			
			if (a == 999) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.print("윗변의 길이를 입력하세요: ");
				int b = sc.nextInt();
				System.out.print("높이를 입력하세요: ");
				int h = sc.nextInt();
				double s = (a + b) * h / 2.0;
				
				System.out.printf("아랫변: %d, 윗변: %d, 높이: %d\n", a, b, h);
				System.out.printf("사다리꼴 면적: %.1f\n", s);
			}
		}
		
		sc.close();
	}
}
