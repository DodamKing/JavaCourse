package t05_interface_exam;

import java.util.Scanner;

public class ActorRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] title = {"경찰관", "소방관", "요리사"};
		int no;
		Actor actor = new Actor();
		
		while(true) {
			System.out.println("어떤 배우가 되고 싶나요");
			System.out.print("1.경찰관 | 2.소방관 | 3.요리사 |0.종료");
			no = scanner.nextInt();
			if (no <= 0 || no > 3) break;
			else if (no == 1) {
				System.out.println(title[0] + "의 역활은");
				actor.catching();
				actor.searching();
			}
			else if (no == 2) {
				System.out.println(title[1] + "의 역활은");
				actor.fire();
				actor.rescue();
			}
			else if (no == 3) {
				System.out.println(title[2] + "의 역활은");
				actor.cooking();
				actor.makingFood();
			}
			System.out.println("------------------------------------");
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}

