package t03_memberClass;

public class E {
	int suE = 600;
	
	public E() {
		System.out.println("이곳은 E");
	}
	
	public void methodE1() {
		System.out.println("E의 mehtodE1");
		
		class F {
			int suF = 700;
			public F() {
				System.out.println("E의 mehtodE1의 F");
			}
			void methodF() {
				System.out.println("E의 mehtodE1의 F의 methodF");
			}
		}
		
		F f = new F();
		System.out.println(f.suF);
		f.methodF();
	}
	
	public void methodE2() {
		System.out.println("E의 mehtodE2");
	}
	
		class F {
			
		}
}
