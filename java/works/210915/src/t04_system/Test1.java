package t04_system;

public class Test1 {
	public static void main(String[] args) {
		int tot = 0, i;
		
		System.out.println("시스템 클래스 연습");
		for (i=0; i<101; i++) {
			tot += i;
			if(tot > 1000) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("100까지 합: " + tot);
	}
}
