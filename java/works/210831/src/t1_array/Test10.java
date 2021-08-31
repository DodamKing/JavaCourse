package t1_array;

public class Test10 {
	public static void main(String[] args) {
		int[] su1 = {10, 20, 30, 40, 50};
		int[] su2 = new int[5];
		
//		for (int i=0; i<su1.length; i++) {
//			su2[i] = su1[i];
//		}
		
		// arrayCopy()
		System.arraycopy(su1, 0, su2, 0, su1.length);
		
		
		// su1 출력
		for (int i=0; i<su1.length; i++) {
			System.out.printf("su[%d] = %d\n", i, su1[i]);
		}
		System.out.println();
		
		// su2 출력
		for (int i=0; i<su2.length; i++) {
			System.out.printf("su[%d] = %d\n", i, su2[i]);
		}
		
	}
}
