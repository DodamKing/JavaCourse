package t1_ifTest;

import java.util.Scanner;


// 국어, 영어 점수를 입력 받아서 합격여부 파별하시오
//평균이 60점 이상이면 합격
//과락은 40점
//평균미달, 과락탈락 출력
public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력 하세요: ");
		double korean = sc.nextDouble();
		System.out.print("영어 점수를 입력 하세요: ");
		double english = sc.nextDouble();
		double average = (korean + english) / 2.0;
		
		String result;
		if (average >= 60) 
			if ((korean >= 40) && (english >= 40)) result = "합격";
			else result = "과락탈락";
		else result = "평균미달";
		
		System.out.println("국어: " + korean + " 영어: " + english + " 평균: " + average);
		System.out.println("당신은 " + result + " 입니다.");
		
		sc.close();
	}
	
	
}
