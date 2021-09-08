package t04_hwk_re;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		int choice, cnt = 0;
		Scanner scanner = new Scanner(System.in);
		LunchMenu lunchmenu = new Child();
		
		System.out.println("아이를 선택하세요.");
		System.out.printf("1.철수 | 2.영희 ");
		System.out.print("선택> ");
		lunchmenu.child = scanner.next();
		
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.두부조림 | 2.미역국 | 3.요플레 | 4.바나나 | 5.유유 | 6.아몬드 | 0.종료");
			System.out.print("선택> ");
			choice = scanner.nextInt();
			
			if (choice == 0) break;
			lunchmenu.order[cnt + 2] = choice + 1;
			System.out.print(lunchmenu.menuTitle[choice + 1] + " 를(을) 선택하셨습니다.");
			cnt++;
		}
		
		lunchmenu.menuCnt = cnt;
		lunchmenu.run();
		
		scanner.close();
	}
}
