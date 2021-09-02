package t1_class;

public class Test6_run {
	public static void main(String[] args) {
		Test6 t6 = new Test6(100, 90, 80);
		System.out.printf("성명: %s, 국어: %d, 영어: %d, 수학: %d;\n", t6.name, t6.kor, t6.eng, t6.mat);
		System.out.println();
		System.out.println(t6.name + "의 총점은: " + t6.total());
		System.out.println();
		t6.avg();
		t6.grade();
	}
}
