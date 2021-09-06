package t5_polymorphism;

public class Run2 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = new B();
		B b1 = (B) a1;
		
		A a2 = new C();
		C c1 = (C) a2;
	}
}
