package t4_homework;

import java.util.Scanner;

// 예금 출금 조회 하기
public class Homework_7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int n, temp;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			n = sc.nextInt();
			
			if (n == 1) {
				System.out.print("예금액>");
				temp = sc.nextInt();
				balance += temp;
				System.out.println();
			}
			else if (n == 2) {
				System.out.print("출금액>");
				temp = sc.nextInt();
				balance -= temp;
				System.out.println();
			}
			else if (n == 3) {
				System.out.printf("잔고>%d\n", balance);
				System.out.println();
			}
			else if (n == 4) break;
				
			else{
				System.out.println();
				System.out.println("1 ~ 4를 입력해야 합니다.");
			}
		}
		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();
	}
}
