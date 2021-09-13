package t3_homework;

import java.util.Scanner;

//3.	가위/바위/보/ 게임 프로그램을 만드시오.
//사용자가 입력하고 엔터를치면, 컴퓨터는 랜덤하게 가위/바위/보 중 하나를 선택하여 누가 이겼는지를 출력한다.(단, ‘그만＇을 입력하면 종료한다.)
public class Homework_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int com;
		int user=0;
		String play;
		String[] rsp = {"가위", "바위", "보"};
		String[][] res = {
				{"비겼습니다.", "사용자가 이겼습니다.", "컴퓨터가 이겼습니다."},
				{"컴퓨터가 이겼습니다.", "비겼습니다.", "사용자가 이겼습니다."},
				{"사용자가 이겼습니다.", "컴퓨터가 이겼습니다.", "비겼습니다."}
		};
		while (true) {
			com = (int) (Math.random()*3);
			System.out.println("가위바위보~(종료시 '그만'): ");
			System.out.println("================================");
			System.out.println("1.가위 | 2.바위 | 3.보 | 4.그만");
			System.out.println("================================");
			System.out.print("선택> ");
			play = scanner.next();
			System.out.println();
			if (play.equals("그만")) break;
			else if (play.equals("4")) break;
			else if (play.equals("가위")) user = 0;
			else if (play.equals("바위")) user = 1;
			else if (play.equals("보")) user = 2;
			else if (play.equals("1")) user = 0;
			else if (play.equals("2")) user = 1;
			else if (play.equals("3")) user = 2;
			else user = 3;
			
			if (user == 3) {
				System.out.println("잘못 입력 하셨습니다.!!!");
				System.out.println();
			}
			else {
				System.out.println("-----------------------------------------------");
				System.out.println("com: " + rsp[com] + " vs " + rsp[user] + " :user");
				System.out.println(res[com][user]);
				System.out.println("-----------------------------------------------");
				System.out.println();
			}
		}
		
		System.out.println("프로그램을 종료 합니다.");
		scanner.close();
	}
}
