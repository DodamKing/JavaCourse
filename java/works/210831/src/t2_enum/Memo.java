package t2_enum;

public class Memo {
	public static void main(String[] args) { // 두번째 차원의 크기를 지정하지 않고,
		int[][] score = new int[5][];
		score[0] = new int[4];
		score[1] = new int[4];
		score[2] = new int[4];
		score[3] = new int[4];
		score[4] = new int[4];
		
		for (int i=0; i<5; i++) System.out.println(score[i][0]);
	}
}
