package t1_method;

public class Test2Run {
	public static void main(String[] args) {
		Test2 t2_0 = new Test2();
		t2_0.method1();
		System.out.println();
		t2_0.method2();
		System.out.println();
		mainmethod();
		mainmethod2();
	}
	
	private static void mainmethod2() {
		System.out.println("이곳은 메인 메소드2 입니다.");
	}

	static void mainmethod() {
		System.out.println("이곳은 메인 메소드 입니다.");
	}
}
