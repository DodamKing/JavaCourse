package t4_homework;

import java.util.Scanner;

//(문제3) 1.삼각형/2.사각형/3.사다리꼴 의 면적을 구하시오.
//사용자는 1~3번의 숫자를 입력받아서,
//1번을 입력받으면, '밑변'과 '높이'를 다시 입력받아서 삼각형의 면적을 구한다.
//2번을 입력받으면, '가로'와 '세로'의 길이를 입력받아서 사각형의 면적을 구한다.
//3번을 입력받으면, '아랫변'/'윗변'/'높이'를 입력받아서 사다리꼴의 면적을 구한다.
public class Homework_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, h;
		double s;
		
		
		while(true) {
			System.out.println("=======================================");
			System.out.println("넓이를 구하고 싶은 도형을 선택하세요.");
			System.out.println("1.삼각형/  2.사각형/  3.사다리꼴/  4.종료");
			System.out.println("=======================================");
			System.out.print("선택: ");
			int n = sc.nextInt();
			System.out.println();
			
			if(n == 1) {
				System.out.println("삼각형을 선택하셨습니다.");
				System.out.print("밑변의 길이를 입력하세요: ");
				a = sc.nextInt();
				System.out.print("높이를 입력하세요: ");
				h = sc.nextInt();
				
				s = a * h / 2.0;
				
				System.out.println();
				System.out.println("밑변: " + a + ", 높이 : " + h);
				System.out.printf("삼각형의 넓이는 %.1f 입니다.\n", s);
				System.out.println();
			}
			else if(n == 2) {
				System.out.println("사각형을 선택하셨습니다.");
				System.out.print("가로의 길이를 입력하세요: ");
				a = sc.nextInt();
				System.out.print("세로의 길이를 입력하세요: ");
				b = sc.nextInt();
				
				s = a * b;
				
				System.out.println();
				System.out.println("밑변: " + a + ", 세로 : " + b);
				System.out.printf("사각형의 넓이는 %.1f 입니다.\n", s);
				System.out.println();
				
			}
			else if(n == 3) {
				System.out.println("사다리꼴을 선택하셨습니다.");
				System.out.print("아랫변의 길이를 입력하세요: ");
				a = sc.nextInt();
				System.out.print("윗변 길이를 입력하세요: ");
				b = sc.nextInt();
				System.out.print("높이를 입력하세요: ");
				h = sc.nextInt();
				
				s = (a + b) * h / 2.0;
				
				System.out.println();
				System.out.println("아랫변: " + a + ", 윗변: " + b + ", 높이: " + h);
				System.out.printf("사다리꼴의 넓이는 %.1f 입니다.\n", s);
				System.out.println();
			}
			else if (n == 4) break;
			
			else {
				System.out.println();
				System.out.println("1 ~ 3번의 숫자를 입력해야 합니다.");
				System.out.println();
			}
			
		}
		
		System.out.println("END");
		sc.close();
		
	}
}
