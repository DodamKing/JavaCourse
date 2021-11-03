package test;

public class SungjukVO {
	private String name, gender, hakbun; 
	private int kor, eng, mat, tot;
	private double avg;
	private char grade;
	
	public SungjukVO() {}
	
	@Override
	public String toString() {
		return "SungjukVO [name=" + name + ", gender=" + gender + ", hakbun=" + hakbun + ", kor=" + kor + ", eng=" + eng
				+ ", mat=" + mat + ", tot=" + tot + ", avg=" + avg + ", grade=" + grade + "]";
	}
	
	public SungjukVO(String name, String gender, String hakbun, int kor, int eng, int mat, int tot, double avg,
			char grade) {
		this.name = name;
		this.gender = gender;
		this.hakbun = hakbun;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
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
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
}
