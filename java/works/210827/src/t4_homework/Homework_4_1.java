package t4_homework;

//(문제4) 2g, 3g, 5g의 추가 각각 5개씩 준비되어 있다.
//
//이 3개의 추를 조합하여, 무게가 30g ~ 35g 의 값이 될때의 각각의 추의 무게를 출력하는 프로그램을 만드시오?(아래 예와 같이 출력하시오)
//
//예) 2g짜리 5개 + 3g짜리 5개 + 5g짜리 1개 = 30g
public class Homework_4_1 {
	public static void main(String[] args) {
		System.out.println("가능한 경우의 수 출력");
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				for(int k=0; k<6; k++) {
					int sum = 2*i + 3*j + 5*k;
					while (true) {
						int l=0;
						l++;
						if(30 <= sum && sum <= 35) {
							System.out.printf("%d). 2g짜리 %d개 + 3g짜리 %d개 + 5g짜리 %d개 = %dg\n", l, i, j, k, sum);
						}
						
					}
				}
			}
		}
	}
}
