package t93_review2;

public class SungjukService {
	private String grade;
	private double avg;
	private int tot;
	private int[] rankArr = new int[100];
	private int[] totArr = new int[100];
	
	public String getGrade() {
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
	
	public void getRank() {
		SungjukVO[] student = SungjukRun.student;
		int studentIndex = SungjukRun.studentIndex;
		for (int i=0; i<studentIndex; i++) {
			rankArr[i] = 1;
		}
		for (int i=0; i<studentIndex; i++) {
			totArr[i] = student[i].getTot();
		}
		for (int j=0; j<studentIndex; j++) {
			for (int k=0; k<studentIndex; k++) {
				if(totArr[j] < totArr[k]) {
					rankArr[j]++;
				}
			}
		}
		for (int i=0; i<studentIndex; i++) {
			SungjukRun.student[i].setRank(rankArr[i]); // 순위 저장
		}
	}

	public int getTot(int kor, int eng, int mat) {
		 tot = kor + eng + mat;
		return tot;
	}

	public double getAvg() {
		 avg = tot / 3.0;
		return avg;
	}
	
}
