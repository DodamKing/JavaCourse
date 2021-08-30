package t2_array;

public class Test6 {
	public static void main(String[] args) {
//		Mbc() mbc = new Mbc();
		
		int[] atom1 = new int[5];
		int[] atom2 = new int[] {100, 90, 80, 70, 60};
		
		int[] atom3;
		atom3 = new int[5];
		
		int[] atom4 = {100, 90, 80, 70, 60};
		
		System.out.println("atom1 배열의 크기는: " + atom1.length);
		System.out.println("atom2 배열의 크기는: " + atom2.length);
		System.out.println("atom3 배열의 크기는: " + atom3.length);
		System.out.println("atom4 배열의 크기는: " + atom4.length);
		System.out.println();
		
		for (int i=0; i<5; i++) System.out.println(atom4[i]);
	}
}
