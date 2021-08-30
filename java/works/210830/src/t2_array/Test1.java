package t2_array;

public class Test1 {
	public static void main(String[] args) {
		int[] jumsu = new int[5]; // 정수형 배열 선언, 매개변수는 배열의 길이
		
		// 배열에 값 저장
		jumsu[0] = 100;
		jumsu[1] = 80;
		jumsu[2] = 90;
		jumsu[3] = 70;
		jumsu[4] = 60;
//		jumsu[3] = 90;  // 배열의 크기가 5이라 범위 오류가 난다
		
		
		System.out.println("jumsu[0]: " + jumsu[0]);
		System.out.println("jumsu[1]: " + jumsu[1]);
		System.out.println("jumsu[2]: " + jumsu[2]);
		System.out.println("jumsu[3]: " + jumsu[3]);
		System.out.println("jumsu[4]: " + jumsu[4]);
	}
}
