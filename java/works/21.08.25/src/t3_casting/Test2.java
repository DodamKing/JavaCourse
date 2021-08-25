package t3_casting;

public class Test2 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2;
		int i1 = b1 + b2;
		System.out.println("i1 : " + i1);
		System.out.println();
		char c1 = 'A';
		char c2 = 1;
//		char c3 = c1 + c2;
		int i2 = c1 + c2;
		System.out.println("i2 : " + i2);
		System.out.println();
		
		
//		int i3;
		int i3 = 10;
		int i4 = i3/3;
		double i5 = i3/3;
		System.out.println("i4 : " + i4);
		System.out.println("i5 : " + i5);
		System.out.println();
		
		double d1 = (double) i3/3;
		System.out.println("d1 : " + d1);
		
		d1 = i3/3.0;
		System.out.println("d1 : " + d1);
		System.out.println();
		
		int i6;
		double d2 = 3.14;
		i6 = (int) d2;
		System.out.println(i6);
		
		
		
		
	}
}
