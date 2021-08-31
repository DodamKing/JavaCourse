package t1_array;

public class Test9 {
	public static void main(String[] args) {
		int[] su1 = {10, 20, 30, 40, 50};
		int[] su2 = new int[5];
		
		// su1 배열값을 su2로 복사
		for (int i=0; i<su1.length; i++) {
			su2[i] = su1[i];
			
		}
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
