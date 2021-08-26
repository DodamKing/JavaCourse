package t4_homework;

import java.util.Scanner;

//(문제3) 학생 30명에게 각각 똑 같은 개수의 연필을 나눠주려고 한다.
//이때 나눠주려고 하는 연필의 개수를 입력받아서 처리하는데, 이때 학생 1명당 받게 되는 연필의 개수는 몇자루이고, 남는 연필의 개수는 몇자루인지 출력하시오.
//예 : 입력시에 연필의 총개수를 100개를 주었다면, 학생 1명당 받개되는 연필의 개수는 3개씩이고, 3자루씩을 모두 나눠주고 남은 연필의 개수는 10개이다.
public class Homework_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연필의 개수를 입력하세요: ");
		int pen = scanner.nextInt();
		int quo = pen / 30;
		int mod = pen % 30;
		
		System.out.printf("연필의 총 개수는 %d개 이며,\n1명당 받게 되는 연필의 개수는 %d개씩이고,\n남은 연필의 개수는 %d개 이다.", pen, quo, mod);
		
		
		scanner.close();
	}
}
