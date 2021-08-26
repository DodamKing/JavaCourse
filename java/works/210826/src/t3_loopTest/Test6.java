package t3_loopTest;

// 1~100  홀수합
public class Test6 {

	public static void main(String[] args) {

		int i = -1, sum = 0;
		
		while (i < 99) {
			i += 2;
			sum = sum + i;
			System.out.println(i);
		}
		
		System.out.println("1부터 100까지 홀수 합은: " + sum);
	}
}
