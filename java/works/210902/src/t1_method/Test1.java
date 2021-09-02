package t1_method;

public class Test1 {
	int gas = 10;
	
	Test1() {}
	
	Test1(int gas) {
		this.gas = gas;
	}
	
	void run() {
		while (true) {
			if (gas>0) {
				System.out.println("계속 달립니다. 가스잔량: " + gas);
				gas--;
			}
			else {
				System.out.println("멈춥니다. 가스잔량: " + gas);
				return;
			}
		}
	}
	
	void run(int gas) {
		while (true) {
			if (gas>0) {
				System.out.println("계속 달립니다. 가스잔량: " + gas);
				gas--;
			}
			else {
				System.out.println("멈춥니다. 가스잔량: " + gas);
				return;
			}
		}
	}
}
