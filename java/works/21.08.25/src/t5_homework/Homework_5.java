package t5_homework;

import java.util.Scanner;

public class Homework_5 {
	public static void main(String[] args) {
//		(문제5) 첫번째 입력받은 수를 두번째 입력받은 수로 나눴을때의 나머지가 1과 3인경우는 '남자'로,
//        2와 4인 경우는 '여자'로 출력하고,
//        그렇지 않은 경우는 입력받은수와 '오류'라고 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		int first = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		int second = sc.nextInt();
		
		String result = ((first % second == 1) || (first % second == 3)) ? "남자" : ((first % second == 2) || (first % second == 4) ? "여자" : "오류");
		System.out.println(result);
		
		sc.close();
	}
}
