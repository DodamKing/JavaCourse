package t3_exam;

// 로또 번호 생성 (중복 배제)
public class Test6 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int rand, temp;
		
	st: for (int i=0; i<lotto.length; i++) {
			rand = (int) (Math.random()*45) + 1;
			for (int j=0; j<lotto.length; j++) {
				if (rand == lotto[j]) {
					i--;
					continue st;
				}
			}
			lotto[i] = rand;
		}
		
		for (int i=0; i<lotto.length; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp=lotto[i]; lotto[i]=lotto[j]; lotto[j]=temp;
				}
			}
		}
		System.out.println("금주의 로또는?");
		for (int i=0; i<lotto.length; i++) System.out.print(lotto[i] + " / ");
	}
}
