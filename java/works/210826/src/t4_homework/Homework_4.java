package t4_homework;

//(문제4) 1~100까지의 합을 구하되, 각 10항이 되면 해당 누적값을 출력하시오.
//예: 1~10 : 55
//     1~20 : 210
//     1~30 : ~~~
//      ~~~~~
//     1~100 : 5050
public class Homework_4 {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		while(i < 100) {
			i++;
			sum += i;
			if (i % 10 == 0) System.out.printf("1~%d : %d\n", i, sum);
		}
	}
}
