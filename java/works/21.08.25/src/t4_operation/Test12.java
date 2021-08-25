package t4_operation;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		// 점수가 80점 이상은 우수, 60점 이상은 준수, 60점 미만은 미달
		
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt();
		String bigo;
		
		bigo = (jumsu >=80) ? "우수" : ((jumsu >= 60) ? "준수": "미달");
		System.out.println("당신은 " + bigo + "입니다.");
		
		
	}
}
