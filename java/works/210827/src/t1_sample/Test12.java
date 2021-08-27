package t1_sample;

public class Test12 {
	public static void main(String[] args) {
		
		int i = 0, odd = 0, even = 0, sw = 0;
		
		while (i<100) {
			i++;
			if (sw == 0) {
				odd += i;
				sw = 1;
			}
			else {
				even += i;
				sw = 0;
			}
		}
		System.out.println("홀수합 : " + odd);
		System.out.println("짝수합 : " + even);
		
	}
}
