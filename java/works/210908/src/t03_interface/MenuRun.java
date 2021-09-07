package t03_interface;

import java.util.Scanner;

public class MenuRun {
	public static int childIndex = 0;
	public static void main(String[] args) {
		int sw = 0;
		String menu, name;
		String[] theMenu = {"쌀밥", "불고기", "두부조림", "미역국", "요플레", "바나나", "우유", "아몬드"};
		Scanner scanner = new Scanner(System.in);
		Child[] children = new Child[10];
		
		while(true) {
			children[childIndex] = new Child();
			if (sw == 0) {
				sw = 1;
				System.out.print("어린이의 이름을 입력하세요: ");
				children[childIndex].name = scanner.next();
				System.out.println("======================메뉴=========================");
				System.out.println("두부조림 | 미역국 | 요플레 | 바나나 | 우유 | 아몬드");
				System.out.println("=================================================");
				System.out.println("메뉴를 선택하세요.(기본으로 밥과 불고기는 나옵니다.)");
				System.out.println("메뉴 선택을 종료하려면 '0', 프로그램을 종료하려면 'q'를 누루세요.");
			}
			
			System.out.print("선택> ");
			menu = scanner.next();
			
			if (menu.equals("q")) break;
			
			for (int i=0; i<8; i++) {
				if (menu.equals("0")) {
					sw = 0;
					continue;
				}
				else if (menu.equals(theMenu[i])) {
					children[childIndex].howmuch(LunchMenu.price[i], menu);
				}
				
			}
			childIndex++;
		}
		
		for (int i=0; i<childIndex; i++) {
			if (children[i].name != null) {
				System.out.println(children[i].name);
			}
			for (int j=0; j<Child.sickdanIndex; j++) {
				if (children[i].sickdan[j] != null) {
					System.out.println(children[i].sickdan[j] + ": " + children[i].sickdanPrice[j]);
				}
			}
			System.out.println(children[i].getTotal());
		}
		
		System.out.println();
		
		scanner.close();
	}
}
