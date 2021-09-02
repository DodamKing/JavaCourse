package t1_class;

public class Test7_run {
	public static void main(String[] args) {
		int total;
		double avg;
		Test7 t7 = new Test7(100, 90, 80);
		System.out.printf("성명: %s, 국어: %d, 영어: %d, 수학: %d;\n", t7.name, t7.kor, t7.eng, t7.mat);
		System.out.println();
		System.out.println(t7.name + "의 총점은: " + t7.total2("홍길동", 100, 90, 80));
		System.out.println();
//		t7.avg();
		t7.grade();
		total = t7.total2("홍길동", 90, 80, 70);
		System.out.println("여기서 출력: " + total);
		System.out.println();
		avg = t7.avg2(total);
		System.out.println("메쏘드 평균: " + avg);
	}
}
