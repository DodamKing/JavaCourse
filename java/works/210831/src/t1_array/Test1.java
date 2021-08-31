package t1_array;

public class Test1 {
	public static void main(String[] args) {
		int atom  = 0;
		
		System.out.println("atom :" + atom);
		
		int[] mbc = new int[5];
		mbc[0] = 100;
		
		System.out.println("mbc[0] = " + mbc[0] );
		System.out.println("mbc[1] = " + mbc[1] );
		
		double[] sbs = new double[3];
		for (int i=0; i<sbs.length; i++) {
			System.out.println("sbs[" + "i" + "] = " + sbs[i]);
		}
		
		boolean[] kbs = new boolean[3];
		for (int i=0; i<kbs.length; i++) {
			System.out.println("kbs[" + "i" + "] = " + kbs[i]);
		}
		System.out.println();
		
		String[] cjb = new String[3];
		for (int i=0; i<cjb.length; i++) {
			System.out.println("cjb[" + i + "] = " + cjb[i]);
		}
		System.out.println();
		
		char[] ccc = new char[3];
		for (int i=0; i<ccc.length; i++) {
			System.out.println("ccc[" + i + "] = " + ccc[i]);
		}
		System.out.println();
		
		float[] fff = new float[3];
		for (int i=0; i<fff.length; i++) {
			System.out.println("fff[" + i + "] = " + fff[i]);
		}
		System.out.println();
	}
}
