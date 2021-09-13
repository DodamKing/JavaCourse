package t3_homework;

// 로또
public class Homework_4 {
	public static void main(String[] args) {
		int[][] lotto = new int[100][6];
		int[][] rank = new int[45][2];
		int[] week = new int[6];
		int rand, temp;
		
		for (int i=0; i<45; i++) rank[i][0] = i+1;  
		
		for (int i=0; i<100; i++) {
			for (int j=0; j<6; j++ ) {
				rand = (int) (Math.random()*45) + 1;
				lotto[i][j] = rand;
				for (int k=0; k<j; k++) {
					if (rand == lotto[i][k]) {
						j--;
						break;
					}
					
				}
		
			}
		}
		
		for (int i=0; i<100; i++ ) {
			for (int j=0; j<6; j++) {
				rank[lotto[i][j]-1][1]++;
			}
		}
		
		System.out.println("로또 숫자 : 빈도");
		for (int i=0; i<45; i++) System.out.println(rank[i][0] + " : " + rank[i][1] + "번");
		System.out.println();
		
		for (int i=0; i<44; i++) {
			for (int j=0; j<44; j++) {
				if (rank[j][1] < rank[j+1][1]) {
					temp=rank[j][0];rank[j][0]=rank[j+1][0];rank[j+1][0]=temp;
					temp=rank[j][1];rank[j][1]=rank[j+1][1];rank[j+1][1]=temp;
				}
			}
		}
		
		System.out.println("가장 많이 나온 로또 숫자 6개의 빈도");
		for (int i=0; i<6; i++) System.out.println(rank[i][0] + " : " + rank[i][1] + "번");
		System.out.println();
		
		for (int i=0; i<6; i++) week[i] = rank[i][0];
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (week[j] > week[j+1]) {
					temp=week[j];week[j]=week[j+1];week[j+1]=temp;
				}
			}
		}
		
		System.out.println("===================금주의 로또 번호가 나왔어요========================");
		System.out.print("lotto: ");
		for (int i=0; i<6; i++) System.out.print(week[i] + "\t");
	}
}
