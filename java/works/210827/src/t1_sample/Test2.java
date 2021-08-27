package t1_sample;

public class Test2 {
	public static void main(String[] args) {
		
		System.out.println("주사위 두개의 합이 5가 되면 종료");
		int x, y, count = 0;
		
		while (true) {
			x = (int) ((Math.random() * 6) + 1);
			y = (int) ((Math.random() * 6) + 1);
			count++;
			
			System.out.printf("(%d, %d)\n", x, y);
//			System.out.println("("+x+", "+y+")");
			
			if (x+y == 5) {
				System.out.printf("%d번 만에 끝났습니다.", count);
				break;
			}
			
		}
		
		
	}
}
