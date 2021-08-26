package t3_loopTest;

public class Test3 {

	public static void main(String[] args) {
		int i = 0, tot = 0;
		do {
			i++;
			tot += i;
			
		} while(i < 100);
		System.out.println("1부터 100까지의 합: " + tot);
	}
}
