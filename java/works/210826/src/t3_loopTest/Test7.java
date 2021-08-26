package t3_loopTest;

// 1~100 홀수합, 짝수합
public class Test7 {
	public static void main(String[] args) {
		int i = 0, odd = 0, even = 0;
		
		while (i < 100) {
			i++;
			odd += i;
			i++;
			even += i;
			
		}
		System.out.println("홀수합: " + odd);
		System.out.println("작수합: " + even);
		
	}
}
