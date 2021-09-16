package t03_api;

public class Test3Run {
	public static void main(String[] args) {
		Test3 test3 = new Test3("홍길동", 25);
		
		System.out.println(test3.getName());
		System.out.println(test3.getAge());
		System.out.println();

		test3.prn();
		System.out.println();
		
		System.out.println("성명과 나이: " + test3.toString());
		System.out.println();
		
		System.out.println("성명과 나이: " + test3);
		System.out.println();
		
	}
}
