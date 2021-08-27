package t3_shape;

//1 2 3
//4 5 6
//7 8 9

public class Test1 {
	public static void main(String[] args) {
		int res = 0;
		
		for (int i=1; i<4; i++ ) {
			for (int j=1; j<4; j++) {
				res++;
				System.out.print(res + " ");
			}
			System.out.println();
		}
		
		
	}
}
