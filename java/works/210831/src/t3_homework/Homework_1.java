package t3_homework;

import java.util.Scanner;

// 1.	한글과 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어 단어를 입력받으면 한글로 출력하는 프로그램?
//=>  {{“love”, “사랑”},{“java”, “자바”}}
public class Homework_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] dic = {
				{"love", "사랑"},
				{"java", "자바"},
				{"ant", "개미"},
				{"bee", "꿀벌"},
				{"cat", "고양이"},
				{"dog", "개"},
				{"egg", "달걀"},
				{"frog", "개구리"},
				{"god", "신"},
				{"hand", "손"},
				{"iron", "철"},
				{"jam", "잼"}
		};
		String word, num, no;
		
		while (true) {
			System.out.println("=====================================================");
			System.out.println("|| 1.영한사전 | 2.한영사전| 3. 종료 ||");
			System.out.println("=====================================================");
			System.out.print("선택> ");
			num = scanner.next();
			System.out.println();
			
			if (num.equals("1")) {
				System.out.println("영한사전 입니다.------------------");
				System.out.print("찾고자 하는 영어 단어를 입력하세요: ");
				word = scanner.next();
				for (int i=0; i<dic.length; i++) {
					if (word.equals(dic[i][0])) {
						System.out.printf("%s는(은) 한글로 '%s' 입니다.\n", dic[i][0], dic[i][1]);
						System.out.println();
						break;
					}
				}
			}
			if (num.equals("2")) {
				System.out.println("한영사전 입니다.--------------------");
				System.out.print("찾고자 하는 한글 단어를 입력하세요: ");
				word = scanner.next();
				for (int i=0; i<dic.length; i++) {
					if (word.equals(dic[i][1])) {
						System.out.printf("%s는(은) 영어로 '%s' 입니다.\n", dic[i][1], dic[i][0]);
						System.out.println();
					}
				}
			}
			if (num.equals("3")) break;
			
		}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
}
