package t06_String;

public class T2_length {
	public static void main(String[] args) {
		
		
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 오신 것을 환영합니다!!!";
		
		System.out.println(msg1.length());
		System.out.println(msg2.length());
		System.out.println();
		
		System.out.println("대문자로");
		System.out.println(msg1.toUpperCase());
		System.out.println("소문자로");
		System.out.println(msg1.toLowerCase());
		
	}
}
