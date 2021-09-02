package t2_member;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("파이: " + t1.pi);
		
		int plus = t1.plus(10, 20);
		System.out.println("합은: " + plus);
		
		int minus = t1.minus(10, 20);
		System.out.println("차는: " + minus);
	}
}
