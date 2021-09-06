package t1_inheritance;

public class Run {
	public static void main(String[] args) {
//		A a = new A();
		Ga ga = new Ga();
		ga.add(10, 20);
		ga.mul(10, 20);
		System.out.println();
		B b = new B();
		b.area(10, 20);
		System.out.println();
		ga.area(10, 20);
		System.out.println("==============================");
		ga.calc(10, 20);
	}
}
