package t06_String;

public class T3_substring {
	public static void main(String[] args) {
		// 0         1         2
		// 012345678901234567890123456789
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 오신 것을 환영합니다!!!";

		System.out.println("4번째부터 전체 출력");
		System.out.println(msg1.substring(3));
		System.out.println(msg1.substring(3, 6));
		System.out.println(msg2.substring(3, 11));
		System.out.println();
		System.out.println("치환");
		System.out.println(msg1.replace('t', 'T'));
		System.out.println(msg1.replace('o', 'e'));
		System.out.println(msg1.replace(" ", ""));
		
	}
}
