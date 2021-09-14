package t01_generic;

public class Test6VO {
	private int su1;
	private double su2;
	private String name;
	private boolean gender;
	
	public int getSu1() {
		return su1;
	}
	public void setSu1(int su1) {
		this.su1 = su1;
	}
	public double getSu2() {
		return su2;
	}
	public void setSu2(double su2) {
		this.su2 = su2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Test6VO [su1=" + su1 + ", su2=" + su2 + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
