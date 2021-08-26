package t1_ifTest;

import java.util.Scanner;

// 점수를 입력 받아 60 이상은 합격, 40점 이상은 재교육 40점 미만은 불합격 처리하시오.
public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int jumsu;

		System.out.print("첫번째 수를 입력하세요: ");
		jumsu = scanner.nextInt();

		String res;

		if (jumsu >= 60)
			res = "합격";
		else if (jumsu >= 40)
			res = "재교육";
		else
			res = "불합격";

		System.out.println("점수는? " + jumsu);
		System.out.println("당신은 " + res + " 입니다.");

		scanner.close();
	}
}
