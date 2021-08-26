package t2_switchCase;

import java.util.Scanner;

// 'A'는 '수', 'B'는 '우', 'C'는 '미', 'D'는 '양', 'F'는 '가', 나머지는 '오류'
public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력(A, B, C, D, E, F): ");
		String grade =sc.next();
		String res = "";
		
		switch(grade) {
			case "A":
				res = "수";
				break;
			case "B":
				res = "우";
				break;
			case "C":
				res = "미";
				break;
			case "D":
				res = "양";
				break;
			case "F":
				res = "가";
				break;
			default:
				res = "오류";
				
		}
		
		System.out.println("입력한 문자: " + grade);
		System.out.println("학점: " + res);
	
		sc.close();
	}
}
