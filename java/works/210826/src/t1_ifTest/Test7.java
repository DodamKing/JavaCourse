package t1_ifTest;

import java.util.Scanner;

// 점수를 입력 받아 90점 이상은 'A학점' 
//80점 이상은 'B학점'.
//70점 이상은 'C학점'.
//60점 이상은 'D학점'.
//60점 미만은 'F학점'.
public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int jumsu;

		System.out.print("첫번째 수를 입력하세요: ");
		jumsu = scanner.nextInt();

		String res;

		if (jumsu >= 90)
			res = "A학점";
		else if (jumsu >= 80)
			res = "B학점";
		else if (jumsu >= 70)
			res = "C학점";
		else if (jumsu >= 60)
			res = "D학점";
		else
			res = "F학점";

		System.out.println("점수는? " + jumsu);
		System.out.println("당신은 " + res + " 입니다.");

		scanner.close();
	}
}
