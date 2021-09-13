package t03_memberClass;

public class A {
	int suA1 = 100;
	
	public A() {
		System.out.println("이곳은 A");
	}
	
	public void methodA1() {
		System.out.println("이곳은 A1 객체의 methodA1 입니다.");
	}
	
	public class B {
		int suA$B = 200;
		
		public B() {
			System.out.println("이곳은 A$B객체");
		}
		
		public void methodA$B(){
			System.out.println("이곳은 B객체 methodA$B 입니다.");
		}
	}
}
