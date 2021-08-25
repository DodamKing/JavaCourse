package t1_variable;

public class Test1 {
	public static void main(String[] args) {
		byte a1;
		byte a2 = 10;
		byte a3 = 127;
//		byte a4 = 128;
		byte a5 = -127;
		byte a6 = -128;
//		byte a7 = -129;
		
		short b1 = 128;
		short b2 = 31000;
//		short b3 = 33000;
		
		int c1 = 33000;
		int c2 = 2100000000;
//		int c3 = 2200000000;

		long d1 = 220000000;
		
//		System.out.println(d1);
		
		
		char e1 = 'a';
		char e2 = 'A';
		System.out.println("a: " + e1);
		System.out.println("A: " + e2);
		
		char e3 = 65;	// 아스키코드 A = 65
		char e4 = 97;	// 아스키코드 a = 97
		System.out.println("65: " + e3);
		System.out.println("97: " + e4);

		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)'A');
		
	}
}
