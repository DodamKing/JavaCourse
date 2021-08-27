package t3_shape;

//3 2 1
//6 5 4
//9 8 7

public class Test4 {
	public static void main(String[] args) {
		int res = 4;
		
		for (int i=1; i<4; i++ ) {
			for (int j=1; j<4; j++) {
				res--;
				System.out.print(res + " ");
			}
			res += 6;
			System.out.println();
		}
		
		
	}
}
