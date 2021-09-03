package t92_review;

import java.util.Scanner;

public class Test1Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		boolean run = true;
		Test1 t1 = new Test1(answer);
		System.out.println(t1.answer);
		System.out.println("1~99까지 숫자 중 하나를 골라 맞춰보세요.");
		while (run) {
			System.out.print("수를 입력하세요: ");
			int guess = scanner.nextInt();
			run = t1.game(guess);
		}
		scanner.close();
	}
}
