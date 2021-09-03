package t93_review2;

public class SungjukVO {
	private int no;
	private String name;
	private int kor, eng, mat;
	private int tot;
	private double avg;
	private String grade;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(getJumsuCheck(kor)) this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(getJumsuCheck(eng))
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		if(getJumsuCheck(mat))
		this.mat = mat;
	}
	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	boolean getJumsuCheck(int jumsu) {
		if(jumsu < 0 || jumsu > 100) {
			System.out.println("점수의 범위는 0~100 사이어야 합니다.");
			return false;
		}
		return true;
	}
	
}
