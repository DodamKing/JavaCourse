package t1_class;

public class Test8 {
	String name = "익명";
	int kor, eng, mat, total;
	double avg;
	String grade;
	
	public Test8() {
	}
	
	public Test8(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	void total() {
		this.total = this.kor + this.eng + this.mat;
	}
	
	void avg() {
		this.avg = total / 3.0;
		System.out.println("평균: " + avg);
	}
	
	String grade() {
		String grade="";
		this.grade = grade;
		
		switch ((int) avg/10) {
			case 10: 
			case 9: {
				grade = "A";
				break;
			}
			case 8: {
				grade = "B";
				break;
			}
			case 7: {
				grade = "C";
				break;
			}
			case 6: {
				grade = "D";
				break;
			}
			default: grade = "F";
		}
//		System.out.println("학점은: " + grade);
		return grade;
	}
	
	int total2(String name, int kor, int eng, int mat) {
		total = kor + eng + mat;
//		System.out.println("클래스 에서 출력: " + total);
		return total;
	}
	
	int total2(String name, int kor, int eng) {
		total = kor + eng;
		return total;
		
	}
	
	double avg2(int total) {
		avg = this.total / 3.0;
		return avg;
	}
}
