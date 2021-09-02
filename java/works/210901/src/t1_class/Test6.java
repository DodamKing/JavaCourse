package t1_class;

public class Test6 {
	String name = "익명";
	int kor, eng, mat, total;
	double avg;
	String grade;
	
	public Test6(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int total() {
		this.total = this.kor + this.eng + this.mat;
		return total;
	}
	
	void avg() {
		this.avg = total / 3.0;
		System.out.println("평균: " + avg);
	}
	
	void grade() {
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
		System.out.println("학점은: " + grade);
	}
}
