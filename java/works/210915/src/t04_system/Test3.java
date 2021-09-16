package t04_system;

public class Test3 {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		long tot = 0;
		
		for (long i=0; i<900000000; i++) {
			tot += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println(tot);
		System.out.println(time2 - time1);
	}
}
