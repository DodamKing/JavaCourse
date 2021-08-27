package t1_sample;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ans; 
		int cnt = 0;
		
		while(true) {
			cnt++;
			System.out.print("수를 입력하세요: ");
			ans = sc.next().toLowerCase();
			if(ans.equals("ok") ) break;
			System.out.println("수행회수: " + cnt);
		}
		
		System.out.println("---------------");
		System.out.println("전체수행회수: " + (cnt - 1));
		System.out.println("END");
		
		sc.close();
		
		
	}
}
