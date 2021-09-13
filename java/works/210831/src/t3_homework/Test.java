package t3_homework;

// 로또
public class Test {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int rand, temp;
		
//		for (int i=0; i<6; i++ ) {
//			rand = (int) (Math.random()*45) + 1;
//			lotto[i] = rand;
//			for (int j=i-1; j>=0; j--) {
//				if (rand == lotto[j]) {
//					i--;
//					break;
//				}
//				
//			}
			
			for (int j=0; j<6; j++ ) {
				rand = (int) (Math.random()*45) + 1;
				lotto[j] = rand;
				for (int k=0; k<j; k++) {
					if (rand == lotto[k]) {
						j--;
						break;
					}
					
				}
		
			}
		for (int i=0; i<6; i++) System.out.println(lotto[i]);
	}
}
