package t1_method;

public class Test4Run {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.calc1(10, 20);
		System.out.println();
		
		t4.calc2(10, 20, 30);
		System.out.println();
		
		int[] arrays = {1, 2, 3, 4, 5};
		t4.calc3(arrays);
		System.out.println();
		
		t4.calc3(new int[] {6, 5, 4, 3, 2,});
		System.out.println();
		
		t4.calc4(new int[] {6, 5, 4, 3, 2,});
		
		t4.calc4(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println();
		
		System.out.println("합계는: " + t4.calc5(10, 20, 30, 40));
		
	}
}
