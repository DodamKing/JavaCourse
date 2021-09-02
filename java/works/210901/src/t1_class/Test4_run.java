package t1_class;

public class Test4_run {
	public static void main(String[] args) {
		Test4 test4 = new Test4();
		System.out.println("kor(test4): " + test4.kor);
		
		Test4 t4 = new Test4();
		System.out.println("kor(t4): " + t4.kor);
		
		Test4 t4_1 = new Test4(80);
		System.out.println("kor(t4_1): " + t4_1.kor);
		
		Test4 t4_2 = new Test4(50);
		System.out.println("kor(t4_2): " + t4_2.kor);
	}
}
