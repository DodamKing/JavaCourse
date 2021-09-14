package t05_hwk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 수를 입력 받아 리스트로 오름차순 정렬 출력
public class Hwk_02 {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> vos = new ArrayList<Integer>();
		
		while (true) {
			System.out.print("수를 입력하세요 999를 입력하면 종료 됩니다: ");
			number = scanner.nextInt();
			if (number == 999) break;
			vos.add(number);
		}
		
		System.out.println("원본자료: " + vos);
		
		Collections.sort(vos);
		
		System.out.println("정렬자료: " + vos);
		
		scanner.close();
	}
}
