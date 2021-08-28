package t4_homework;

import java.util.Scanner;

//(문제1) 컴퓨터에게 임의의 난수(1~100)를 한개 발생시킨후 그 값을 찾는 프로그램을 작성하시오.(단, 기회는 7번, 만약에 1번만에 맞추면 보너스 100점, 2번은 50점, 3번은 30점)
//예 :     컴퓨터가 발생시킨 난수가 '30'이라고 가정하면
//  1회전 : 50        <--50을 입력했다고 하면 다음줄에 '더 작은수를 입력하세요'
//  더 작은수를 입력하세요
//  2회전 : 20        <--20을 입력했다고 하면 다음줄에 '더 큰수를 입력하세요'
//  더 큰수를 입력하세요
//  3회전 : 30
//  3번만에 맞치셨습니다.
public class Homework_1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String guess;
		int score, cnt = 0;
		int ans = (int)(Math.random() * 100) + 1;
		System.out.println("정답: " + ans); // 정답 확인용 출력값 조정
		System.out.println();
		System.out.println("=======================================================");
		System.out.println("                      Game Start!!");
		System.out.println("1). 1 ~ 100 수를 입력하라고, 기회는 7번이야");
		System.out.println("2). 만약에 1번만에 맞추면 보너스 100점, 2번은 50점, 3번은 30점이라구!");
		System.out.println("3). 종료를 원하면 'q'를 누르세요.");
		System.out.println("=======================================================");
		
		while(true) {
			try {
				System.out.print("수를 입력하세요: ");
				guess = sc.next();
				System.out.println();
								
				if (guess.equals("q")) break;  
				
				else if (1 <= Integer.parseInt(guess) && Integer.parseInt(guess) <= 100) {
					cnt++;
					if(cnt == 1) score = 100;
					else if (cnt == 2) score = 50;
					else if (cnt == 3) score = 30;
					else if (cnt == 7) {
						System.out.println("시도횟수 초과!!");
						break;
					}
					else score = 0;
					
					if(ans > Integer.parseInt(guess)) {		// String을 int로 변환		
						System.out.println("-----------------------------");
						System.out.println("더 큰수를 입력하세요.");
					}
					else if(ans < Integer.parseInt(guess)) {
						System.out.println("-------------------------------");
						System.out.println("더 작은수를 입력하세요.");
					}
					else {
						System.out.println("--------------------------------");
						System.out.printf("%d번만에 맞추셨습니다.\n", cnt);
						System.out.printf("보너스 점수는 %d점 입니다.\n", score);
						break;
					}
					System.out.printf("%d회전 : %s\n", cnt, guess);
					System.out.println("-----------------------------------");
				}
					
				else throw new Exception();  // 범위 외의 숫자나 문자가 들어오면 오류를 강제로 발생

			}
			catch(Exception e) {
				System.out.println("1~100 '숫자'를 입력하세요!!!");  // 오류시 출력
			}
				
		}
		System.out.println("END");
		sc.close();
	}
}
