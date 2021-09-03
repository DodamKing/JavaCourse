package t9_hwk;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int index = 0;
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
		System.out.println();
		System.out.println("계좌를 생성합니다. 다음을 입력하세요.----------");
		System.out.print("예금주: ");
		String owner = scanner.next();
		System.out.print("초기 입금액: ");
		int balance  = scanner.nextInt();
		accountArray[index] = new Account("111-"+(String.format("%03d", index+1)), owner, balance); 
		System.out.printf("%s님 계좌를 생성했습니다.\n", owner);
		System.out.println();
		index++;
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println();
		System.out.println("----------------계좌목록-----------------");
		System.out.println("번호\t계좌번호\t\t예금주\t잔액");
		for (int i=0; i<index; i++) {
			System.out.println(" " + (i+1) + "\t" + accountArray[i].getAno() + "\t\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}
	
	//예금하기
	private static void deposit() {
		int num = 0;
		System.out.println();
		System.out.print("입금할 계좌번호를 입력하세요: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		for (int i=0; i<index; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				balance += accountArray[i].getBalance();
				accountArray[i].setBalance(balance);
				break;
			}
			num++;
		}
		System.out.println("예금이 성공적으로 이루어 졌습니다.");
		System.out.printf("%s님의 잔액은 %d 입니다.\n\n", accountArray[num].getOwner(), accountArray[num].getBalance());
	}
	
	//출금하기
	private static void withdraw() {
		int num = 0;
		System.out.println();
		System.out.print("출금할 계좌번호를 입력하세요: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		for (int i=0; i<index; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				if (balance < accountArray[i].getBalance()) {
					balance = accountArray[i].getBalance() - balance;
					accountArray[i].setBalance(balance);
					break;
				}
				else {
					System.out.println("잔액이 부족합니다.");
					return;
				}
			}
			num++;
		}
		System.out.println("출금이 성공적으로 이루어 졌습니다.");
		System.out.printf("%s님의 잔액은 %d 입니다.\n\n", accountArray[num].getOwner(), accountArray[num].getBalance());
	}
}
