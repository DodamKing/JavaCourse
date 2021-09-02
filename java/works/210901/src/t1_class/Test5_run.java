package t1_class;

public class Test5_run {
	public static void main(String[] args) {
		Test5 t5_1 = new Test5("홍길동");
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d\n", t5_1.name, t5_1.kor, t5_1.eng, t5_1.mat);
		System.out.println();
		Test5 t5_2 = new Test5(20);
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d\n", t5_2.name, t5_2.kor, t5_2.eng, t5_2.mat);
		System.out.println();
		Test5 t5_3 = new Test5(30, 40);
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d\n", t5_3.name, t5_3.kor, t5_3.eng, t5_3.mat);
		System.out.println();
		Test5 t5_4 = new Test5(30, 40, 50);
		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d\n", t5_4.name, t5_4.kor, t5_4.eng, t5_4.mat);
		
		
	}
}
