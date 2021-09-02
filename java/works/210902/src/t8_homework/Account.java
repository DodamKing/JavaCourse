package t8_homework;

public class Account {
	private int balance;
	private static int MIN_BALANCE = 0;
	private static int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	
}
