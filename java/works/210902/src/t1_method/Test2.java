package t1_method;

public class Test2 {
	void method1() {
		System.out.println("이곳은 method1 입니다.");
		method2();
	}
	
	void method2() {
		method3();
		System.out.println("이곳은 method2 입니다.");
	}

	void method3() {
		 System.out.println("이곳은 method3 입니다.");
	}
}
