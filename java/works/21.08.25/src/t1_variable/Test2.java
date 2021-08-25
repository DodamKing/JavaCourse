package t1_variable;

public class Test2 {
	public static void main(String[] args) {
		float g1 = 3.14f;
		System.out.println("3.14f : " + g1);
		
		float g2 = 3.1415921234567890001234567f;
		System.out.println("3.1415928234567890001234567f : " + g2);
		System.out.println();
		float g3 = 100;
		float g4 = 100f;

		
		double h1 = 3.14;
		double h2 = 3.1415921234567890001234567f;
		System.out.println("3.1415928234567890001234567 : " + h2);
		System.out.println();
		
		double h3 = 100;
		double h4 = 100f;
		System.out.println("100: " + h3);
		System.out.println("100f: " + h4);
		System.out.println();
		
		
		// boolean(논리형자료를 기억하는 Type)
		boolean i1 = true;
		boolean i2 = false;
		System.out.println("i1 : " + i1);
		System.out.println("i2 : " + i2);
		System.out.println();
		
		int j1 = 100, j2 = 200;
		boolean i3;
		i3 = j1 > j2;
		System.out.println("i3 : " + i3);
		System.out.println();
		
	}
}
