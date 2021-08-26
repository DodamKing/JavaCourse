package t4_homework;

//(문제5) 1~100까지의 합을 구하되, 아래와 같을경우 값을 출력하시오?
//	    1 ~ 10 : 55
//	   11 ~ 20 : ....
//	   21 ~ 30 : ....
//	   31 ~ 40 : ....
//	   41 ~ 50 : ....
//	   ~~~~~~~
//	   99 ~ 100 : ....
public class Homework_5 {
	public static void main(String[] args) {
		
		int sum = 0, count = 0;
		
		for (int i=1; i<101; i++) {
			sum += i;
			count++;
			
			if (count % 10 == 0) {
				System.out.printf("%d ~ %d : %d\n", i-9, i, sum);			
				sum = 0;
			}
		}
	}
}

