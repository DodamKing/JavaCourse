package t4_homework;

import java.util.Random;
import java.util.Scanner;

//(문제2) 프로그램 시작시에 임의의 초기값(1~99)을 변수 한개에 기억시켜두고, 그 값을 키보드를 통해서 입력받아 맞추는 프로그램을 작성하시오.  이때 몇번만에 맞췄는지를 출력하시오.(단, 기회는 5번까지로 한다.)
public class Homework_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int answer = random.nextInt(99);
		System.out.println(answer);
		int i = 0;
		
		while (true) {
			i++;
			System.out.print("1 ~ 99 사이의 정수를 입력하세요.(단 기회는 5번): ");
			int guess = sc.nextInt();
			
			if (i < 5) {
				if (answer == guess) {
					System.out.printf("정답입니다. %d번만에 맞췄습니다.", i);
					break;
				}
				else {
					System.out.printf("입력값: %d, 틀렸습니다.\n", guess);
				}
			}
			else {
				System.out.printf("5회만에 맞추지 못했습니다. 정답은 %d 입니다.", answer);
				break;
			}
		}
		
		sc.close();
		
		
	}
}
