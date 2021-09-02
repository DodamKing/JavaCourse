package t9_hwk;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금| 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			
			int selentNo = scanner.nextInt();
			
			if(selentNo == 1) {
				createAccount();
			}
			else if(selentNo == 2) {
				accountList();
			}
			else if(selentNo == 3) {
				deposit();
			}
			else if(selentNo == 4) {
				withdraw();
			}
			else if(selentNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.print("이름을 입력하세요: ");
		Account[] AccaccountArray = scanner.next();
	}
	
	//계좌목록보기
	private static void accountList() {
		
	}
	
	//예금하기
	private static void deposit() {
		
	}
	
	//출금하기
	private static void withdraw() {
		
	}
}
