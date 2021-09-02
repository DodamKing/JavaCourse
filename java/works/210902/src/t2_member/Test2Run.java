package t2_member;

public class Test2Run {
	public static void main(String[] args) {
		
		System.out.println("파이: " + Test2.pi);
		
		int plus = Test2.plus(10, 20);
		System.out.println("합은: " + plus);
		
		int minus = Test2.minus(10, 20);
		System.out.println("차는: " + minus);
		System.out.println("====================================");
		
		Test2 t2 = new Test2();
		System.out.println("파이: " + t2.pi);
		
		int plus1 = t2.plus(10, 20);
		System.out.println("합은: " + plus1);
		
		int minus2 = t2.minus(10, 20);
		System.out.println("차는: " + minus2);
		
		System.out.println("수: " + t2.su);
		
	}
}
