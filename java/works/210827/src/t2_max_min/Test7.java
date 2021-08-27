package t2_max_min;

// -1 +2 -3 +4 -5 +6 -7 +8 -9 +10
public class Test7 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0, s = 1;
		
		for (i=1; i<11; i++) {
			s *= -1;
			tot += i * s;
//			System.out.println("s: " + s);
//			System.out.println("tot: " + tot);
		}
		System.out.println("tot: " + tot);
		
	}
}
