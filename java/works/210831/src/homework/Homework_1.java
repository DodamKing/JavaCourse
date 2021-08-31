package homework;

import java.util.Scanner;

public class Homework_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;
		String[][] dic = {
				{"love", "사랑"},
				{"java", "자바"},
				{"ant", "개미"},
				{"bee", "꿀벌"},
				{"cat", "고양이"},
				{"dog", "개"},
				{"egg", "달걀"},
				{"frog", "개구리"},
				{"gun", "총"},
				{"hi", "안녕"},
				{"iron", "철"}
		};
		while (true) {
			System.out.println("==============================");
			System.out.println("1.영한사전 | 2.한영사전 | 3.종료");
			System.out.println("==============================");
			System.out.print("선택> ");
			if (scanner.nextInt() == 1) {
				System.out.println("==============================");
				System.out.print("단어를 입력 하세요: ");
				for (int i=0; i<11; i++) {
					if (scanner.next().equals(dic[i][0])) {
						System.out.printf("%s는 한글로 %s 입니다.\n", dic[i][0], dic[i][1]);
						break;
					}
				System.out.println("내 사전에는 없는 단어다.");
				}
			}
		
			else if (scanner.nextInt() == 3) break;
		
		
		}
		scanner.close();
	}
}
