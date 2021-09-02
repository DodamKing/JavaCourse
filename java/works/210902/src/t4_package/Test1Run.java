package t4_package;

public class Test1Run {
	public static void main(String[] args) {
		int add, sub, mul;
		double div;
		Test1 t1 = new Test1();
		
		add = t1.add(10, 20);
		sub = t1.sub(10, 20);
		mul = t1.mul(10, 20);
		div = t1.div(10, 20);
		
		System.out.println("합: " + add);
		System.out.println("차: " + sub);
		System.out.println("곱: " + mul);
		System.out.println("나누기: " + div);
		
	}
}
