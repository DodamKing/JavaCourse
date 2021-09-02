package t1_class;

public class TProcess {
	String name = "익명";
	int kor, eng, mat, total;
	double avg;
	String grade;
	
	public TProcess() {}
	
	int total2(String name, int kor, int eng, int mat) {
		total = kor + eng + mat;
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
		return grade;
	}
}
