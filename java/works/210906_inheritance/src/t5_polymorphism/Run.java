package t5_polymorphism;

public class Run {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		B b1 = d;
//		B b2 = e;
		
		 B b2 = (B) a1;
	}
}
