package t3_homework;

//2.	1~99까지의 수중 3/6/9 게임에서 박수를 쳐야하는 경우를 순서대로 출력하시오.
public class Homework_2 {
	public static void main(String[] args) {
		int[] number = new int[99];
		int[] clap = new int[99];
		int cnt=0;
		
		for (int i=0; i<99; i++) number[i] = i+1;
		
		for (int i=0; i<99; i++) {
			if (number[i]/10 == 3 || number[i]/10 == 6 || number[i]/10 == 9) {
				clap[cnt] = number[i];
				cnt++;
			}
			else if (number[i]%10 == 3 || number[i]%10 == 6 || number[i]%10 == 9) {
				clap[cnt] = number[i];
				cnt++;
			}
		}
		for (int i=0; i<cnt; i++) {
			if (i%10==0 && i!=0) System.out.println(); 
			System.out.print(clap[i] + "\t");
		}
		
	}
}
