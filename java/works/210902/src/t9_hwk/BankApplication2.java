package t9_hwk;

import java.util.Scanner;

public class BankApplication2 {
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
		System.out.println();
	}
	
	//예금하기
	private static void deposit() {
		System.out.println();
		System.out.print("입금할 계좌번호를 입력하세요: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			return;
		}
		else {
			account.setBalance(account.getBalance() + balance);
		}
		System.out.println("예금이 성공적으로 이루어 졌습니다.");
		System.out.printf("%s님의 잔액은 %d원 입니다.\n\n", account.getOwner(), account.getBalance());
		System.out.println();
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println();
		System.out.print("출금할 계좌번호를 입력하세요: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			return;
		}
		else if (balance < 10000) {
			System.out.println("10000원 미만은 출금 할 수 없습니다.");
			System.out.println();
			return;
		}
		else {
			if (account.getBalance() >= balance) {
				account.setBalance(account.getBalance() - balance);
			}
			else {
				System.out.println("잔액이 부족합니다.");
				System.out.println();
				return;
			}
		}
		
		System.out.println("출금이 성공적으로 이루어 졌습니다.");
		System.out.printf("%s님의 잔액은 %d원 입니다.\n\n", account.getOwner(), account.getBalance());
	}
	// 계좌 찾기 메소드
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i=0; i<index; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
				break;
			}
		}
		if (account == null) {
			System.out.println("해당 계좌를 찾을 수 없습니다.");
			System.out.println();
		}
		return account;
	}
}
