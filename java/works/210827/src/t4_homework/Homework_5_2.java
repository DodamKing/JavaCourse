package t4_homework;

import java.util.Scanner;

//(문제5) 달팽이가 나무를 올라가는데 낮에는 5cm를 올라가고, 밤에는 3.5cm를 내려온다고 할때, 이 달팽이가 전체길이 20Cm의 나무 정상에 올라가려면 몇일이 걸리는지 프로그램으로 작성하시오?
public class Homework_5_2 {
	public static void main(String[] args) {
		double tree, day, morning, night, more;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("올라갈 나무의 길이를 입력하세요: ");
		tree = sc.nextDouble();
		System.out.print("달팽이가 낮에 올라가는 길이를 입력하세요: ");
		morning = sc.nextDouble();
		System.out.print("달팽이가 밤에 내려오는 길이를 입력하세요: ");
		night = sc.nextDouble();
		
		day = morning - night;
		more = tree - day;
		cnt++;
		
		
		if (morning < night) {
			System.out.println("달팽이는 나무 정상에 오를 수 없습니다. \nEND");
			
		}
		
		else if (tree <= morning) {
			cnt = 1;
			more = tree;
		}
		
		
		else {
			while (true) {
				if (more > 5) {
					more -= day;
					cnt++;
				}
				else {
					cnt++;
					break;
				}
			}
			
		}
		System.out.println();
		System.out.println("===========================================================================");
		System.out.printf("달팽이가 낮에 올라가는 길이: %.1f, 달팽이가 밤에 내려오는 길이: %.1f\n", morning, night);
		System.out.printf("달팽이는 하루에 %.1f만큼 올라갈 수 있으며, 마지막 날에는 %.1f만큼 올라가 정상에 도착합니다.\n", day, more);
		System.out.println("달팽이가 나무 정상에 올라 가려면 " + cnt + "일이 걸립니다.");
		System.out.println("END");
		
		
		sc.close();		
	}
}

//하루에 올라가는 길이는 5-3.5=1.5
//마지막에는 다 올라가면 안내려 오니까 최대한 많이 떨어져 봤다 꼭대기에서 3.5 아래 있음
//그래서 20-3.5=16.5 만큼만 올라가 주면 됨
//하루에 1.5씩 16.5 까지 가는데 얼마나 걸리는지 계산하고 하루가 소수가 아니고 정수로 계산되어야 하니까(1.2일은 2일로)
//계산 값을 올림해버리고
//마지막에 3.5 빼놨으니까 남은 부분 하루 더 올라가서 결과값 출력할 때 1 더해줌