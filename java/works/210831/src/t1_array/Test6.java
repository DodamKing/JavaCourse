package t1_array;

public class Test6 {
	public static void main(String[] args) {
//		int[][] su = new int[2][3] {{10, 20, 30}, {40, 50, 60}}; 2차 배열 사용 불가
//		int[][] su = {{10, 20, 30}, {40, 50, 60}};
		int[][] su = { // 보기 편하게
				{10, 20, 30}, 
				{40, 50, 60}
		};
		
//		for (int i =0; i<2; i++) {
//			for (int j=0; j<3; j++) System.out.printf("su[%d][%d] = %d\n", i, j, su[i][j]);
//		}
		
		for (int i =0; i<su.length; i++) {
			for (int j=0; j<su[0].length; j++) System.out.printf("su[%d][%d] = %d\n", i, j, su[i][j]);
		}
	}
}
