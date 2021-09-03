package t93_review2;

public class SungjukService {
	String grade;
	public String getGrade(double avg) {
		switch ((int)avg/10) {
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
			default:
				grade = "F";
		}
		return grade;
	}
	
}
