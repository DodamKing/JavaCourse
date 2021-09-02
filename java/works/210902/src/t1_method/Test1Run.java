package t1_method;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1_0 = new Test1();
		t1_0.run();
		System.out.println();
		Test1 t1_1 = new Test1(5);
		t1_1.run();
		System.out.println();
		
		t1_0.run();
		System.out.println();
		t1_1.run(10);
		
	}
}
