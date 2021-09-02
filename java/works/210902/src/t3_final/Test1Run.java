package t3_final;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1("America", "123-456", "홍길동");
		System.out.println("국적: " + Test1.NATION);
		System.out.println("주민번호: " + t1.jumin);
		System.out.println("성명: " + t1.name);
		System.out.println();
		
		t1.change("일본", "243-789", "홍말숙");
		
	}
	
}
