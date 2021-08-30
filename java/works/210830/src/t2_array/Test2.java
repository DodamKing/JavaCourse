package t2_array;

public class Test2 {
	public static void main(String[] args) {
		int[] jumsu = new int[5]; // 정수형 배열 선언, 매개변수는 배열의 길이
		
			
		jumsu[0] = 100;
		jumsu[1] = 80;
		jumsu[2] = 90;
		jumsu[3] = 70;
		jumsu[4] = 60;		
		
//		System.out.println("jumsu[0]: " + jumsu[0]);
//		System.out.println("jumsu[1]: " + jumsu[1]);
//		System.out.println("jumsu[2]: " + jumsu[2]);
//		System.out.println("jumsu[3]: " + jumsu[3]);
//		System.out.println("jumsu[4]: " + jumsu[4]);
		
		for (int i=0; i<5; i++) {
			System.out.printf("jumsu[%d]: %d\n", i, jumsu[i]); // 반복문을 이용한 출력
			
		}
	}
}
