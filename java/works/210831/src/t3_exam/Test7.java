package t3_exam;

// 로또 번호 생성 (중복 배제) 100번 돌려
public class Test7 {
	public static void main(String[] args) {
		int[][] lotto = new int[100][6];
		int[] count = new int[45]; // 카운팅
		int[] number = new int[45];
		int rand, temp, cnt=0;
	
		while (cnt<100) {
		st: for (int i=0; i<6; i++) {
				rand = (int) (Math.random()*45) + 1;
				for (int j=0; j<6; j++) {
					if (rand == lotto[cnt][j]) {
						i--;
						continue st;
					}
				}
				lotto[cnt][i] = rand;
				count[lotto[cnt][i]-1]++; 
			}
		
			cnt++;
		}
		
		for (int i=0; i<45; i++) number[i] = i+1; // 로또 번호 배열
		for (int i=0; i<44; i++) {
			for (int j=0; j<44; j++) {
				if (count[j] < count[j+1]) {
					temp=count[j]; count[j]=count[j+1]; count[j+1]=temp;
					temp=number[j]; number[j]=number[j+1]; number[j+1]=temp;
				}
			}
		}
		
		System.out.println("금주의 로또는?");
		for (int i=0; i<6; i++) System.out.print(number[i] + " / ");
	}
}
