package t03_memberClass;

public class C {
	int suC1 = 300;
	
	public C() {
		System.out.println("이곳은 C");
	}
	
	public void methodC1() {
		System.out.println("이곳은 C 객체의 methodC1 입니다.");
	}
	
	public static class D {
		int suC$D = 400;
		
		public D() {
			System.out.println("이곳은 D");
		}
		
		public void methodC$D() {
			System.out.println("이곳은 D 객체의 methodC$D 입니다.");
		}
		
		static int su2C$D = 500;
		static void method2C$D() {
			System.out.println("이곳은 C 객체의 methodC$D 입니다.");
			
		}
	}
}
