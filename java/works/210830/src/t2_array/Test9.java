package t2_array;

import java.util.Scanner;

// 수를 한번에 입력받아 최대, 최소 구하기
// 999 종료, 2자리 정수까지 입력, 크기는 100이내
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] su = new int[100];
		int max = -99, min = 99;
		int cnt = 0, sw = 0;
		
		for (int i=0; i<su.length; i++) {
			System.out.print("수를 입력하세요(999 종료): ");
			su[i] = sc.nextInt();
			if (su[i] == 999) break;
			cnt++;
		}
//		max = min = su[0];
		for (int i=0; i<cnt; i++) {
			if (max < su[i]) max = su[i];
			if (min > su[i]) min = su[i];
		}
		
		// 출력
		System.out.println();
		System.out.println("--------입력값--------");
		for(int i=0; i<cnt; i++) {
			System.out.print(su[i] + "/ ");
		}
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		
		sc.close();
	}
}
