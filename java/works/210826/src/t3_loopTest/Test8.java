package t3_loopTest;

import java.util.Scanner;


//정수를 입력 받아 출력 999가 들어오면 종료
public class Test8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su = 0;
		
		
		while (true) {
			System.out.print("수를 입력하세요(종료시 999): ");
			su = sc.nextInt();
			
			if (su == 999) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			
			System.out.println("입력받은 수: " + su);
		}
		
		sc.close();
		
	}
}
