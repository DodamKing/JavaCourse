package t05_hwk;

import java.util.ArrayList;
import java.util.Scanner;

// 수를 입력 받아 리스트로 오름차순 정렬 출력
public class Hwk_01 {
	public static void main(String[] args) {
		int number, temp;
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> vos = new ArrayList<Integer>();
		
		while (true) {
			System.out.print("수를 입력하세요 999를 입력하면 종료 됩니다: ");
			number = scanner.nextInt();
			if (number == 999) break;
			vos.add(number);
		}
		
		System.out.println("원본자료: " + vos);
		
		for (int i = 0; i < vos.size(); i++) {
			for (int j = 0; j < vos.size()-1; j++) {
				if (vos.get(j) > vos.get(j+1)) {
					temp = vos.get(j);
					vos.set(j, vos.get(j+1));
					vos.set(j+1, temp);
				}
			}
		}
		System.out.println("정렬자료: " + vos);
		
		scanner.close();
	}
}