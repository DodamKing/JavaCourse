package t4_operation;

public class Test1 {
	public static void main(String[] args) {
		int aa = 100, bb = 200;
		double cc = 10.5, dd = 20.5;
		
		System.out.println("aa = " + aa + ", bb = " + bb);
		System.out.println("cc = " + cc + ", dd = " + dd);
		System.out.println();
		
		System.out.printf("aa = %d\n", aa);
		System.out.printf("bb = %d\n", bb);
		
		System.out.printf("cc = %f\n", cc);
		System.out.printf("cc = %.2f\n", cc); // .2 소수점 두자리만 출력
		System.out.printf("cc = %7.2f\n", cc); // 7총 자리수가 7자리
		System.out.printf("cc = %015.2f\n", cc); // 자리수를 0으로 채워서 15자리 출력
		
		
		String str = "서울";
		System.out.printf("str = %s\n", str);
		System.out.printf("str = %10s\n", str);
		
		System.out.printf("str = %s, aa = %d\n", str, aa);
	}
}
