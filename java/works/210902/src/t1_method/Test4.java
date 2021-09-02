package t1_method;

public class Test4 {
	int sum;
	
	void calc1(int su1, int su2) {
		sum = su1 + su2;
		System.out.println("수1: " + su1 + ", 수2: " + su2);
		System.out.println("합은: " + sum);
	}

	public void calc2(int su1, int su2, int su3) {
		sum = su1 + su2 + su3;
		System.out.println("수1: " + su1 + ", 수2: " + su2 + ", 수3: " + su3);
		System.out.println("합은: " + sum);
		
	}
	
	void calc3(int[] arrays) {
		sum = 0;
		for(int i=0; i<arrays.length; i++) {
			System.out.print(arrays[i] + " ");
			sum += arrays[i];
		}
		System.out.println("합은: " + sum);
	}
	
	void calc4(int ... arrays) {
		sum = 0;
		for(int i=0; i<arrays.length; i++) {
			System.out.print(arrays[i] + " ");
			sum += arrays[i];
		}
		System.out.println("합은: " + sum);
	}
	
	// 임의의 수 여러개 합 구하는 메소드
	int calc5 (int ... arrays) {
		sum = 0;
		for(int i=0; i<arrays.length; i++) {
			sum += arrays[i];
		}
		return sum;
	}
}
