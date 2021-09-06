package t6_polymorphism;

public class Run {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.method1();
		child1.method2();
		child1.method3();
		child1.method4();
		
		Test1 t1 = child1;
		t1.method1();
		t1.method2();
		
		Child1 ch1 = (Child1) t1;
		ch1.method1();
		ch1.method2();
		ch1.method3();
		ch1.method4();
		
		Child2 child2 = new Child2();
		child2.method1();
		child2.method2();
		child2.method5();
		child2.method6();
		
		Child2 chTest2 = new Child2();
		chTest2.method1();
		chTest2.method2();
		
		Test1 ch2 = chTest2; 
		
		if (ch2 instanceof Child2)
		{
			Child2 ch = (Child2) ch2;
			ch.method1();
			ch.method5();
		}
		
		
	}
}
