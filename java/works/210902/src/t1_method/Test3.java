package t1_method;

public class Test3 {
	int gas = 10;
	
	Test3() {}
	
	Test3(int gas) {
		this.gas = gas;
	}
	
	void run() {
		gasCalc();
	}
	
	void run(int gas) {
		this.gas += gas;
		gasCalc();
	}
	
	void gasCalc() {
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
