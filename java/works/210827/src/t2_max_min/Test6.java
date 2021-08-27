package t2_max_min;

public class Test6 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0, hap = 0;
		
		for (i=1; i<11; i++ ) {
			tot += i;
			hap += tot;
		}
		System.out.println("누적: " + tot);
		System.out.println("누적의 누적: " + hap);
	}
}
