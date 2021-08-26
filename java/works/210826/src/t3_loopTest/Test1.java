package t3_loopTest;

public class Test1 {

	public static void main(String[] args) {

		int i = 0, sum = 0;
		
		while (i < 100) {
			i++;
			sum = sum + i;
		}
		
		System.out.println("1부터 100까지 자연수의 합은: " + sum);
		System.out.println(i);
	}
}
