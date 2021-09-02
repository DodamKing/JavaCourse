package t1_class;

import java.util.Scanner;

public class TPrint {
	String name = "익명";
	int kor, eng, mat, total;
	double avg;
	String grade;
	
	public TPrint() {}
	
	void print(String name, int kor, int eng, int mat, int total, double avg, String grade) {
		System.out.printf("성명: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.1f, 학점: %s\n\n", name, kor, eng, mat, total, avg, grade);
	}
}
