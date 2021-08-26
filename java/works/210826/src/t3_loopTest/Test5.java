package t3_loopTest;

// 1~100 짝수합
public class Test5 {

	public static void main(String[] args) {

		int i = 0, sum = 0;
		
		while (i < 100) {
			i += 2;
			sum = sum + i;
		}
		
		System.out.println("1부터 100까지 짝수 합은: " + sum);
//		System.out.println(i);
	}
}
