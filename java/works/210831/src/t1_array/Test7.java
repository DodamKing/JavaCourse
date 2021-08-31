package t1_array;

public class Test7 {
	public static void main(String[] args) {
		int[][] su = {
				{10, 20},
				{30, 40, 50},
				{60}
		};
		
		for (int i=0; i<su.length; i++) {
			for (int j=0; j<su[i].length; j++) {
				System.out.printf("su[%d][%d] = %d,  ", i, j, su[i][j]); 
			}
			System.out.println();
		}
	}
}
