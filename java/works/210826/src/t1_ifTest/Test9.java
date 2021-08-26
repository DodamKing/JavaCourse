package t1_ifTest;

import java.util.Scanner;


// 국어, 영어 점수를 입력 받아서 합격여부 파별하시오
//평균이 60점 이상이면 합격
//과락은 40점
//평균미달, 과락탈락 출력
public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력 하세요: ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력 하세요: ");
		int english = sc.nextInt();
		double average = (korean + english) / 2.0;
		
		String result;
		if (average >= 60) 
			if ((korean >= 40) && (english >= 40)) result = "합격";
			else result = "과락탈락";
		else result = "평균미달";
		
//		System.out.println("국어: " + korean + " 영어: " + english + " 평균: " + average);
//		System.out.println("당신은 " + result + " 입니다.");
		
		System.out.printf("국어 점수는 %d, 영어 점수는 %d, 평균은 %5.2f 입니다.\n", korean, english, average);
		System.out.printf("당신은 %s 입니다.\n", result);
		
		sc.close();
	}
	
	
}
