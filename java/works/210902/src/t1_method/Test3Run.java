package t1_method;

public class Test3Run {
	public static void main(String[] args) {
		Test3 t1_0 = new Test3();
		t1_0.run();
		System.out.println();
		Test3 t1_1 = new Test3(5);
		t1_1.run();
		System.out.println();
		
		t1_0.run();
		System.out.println();
		t1_1.run(10);
		System.out.println();
		
		
	}
}
