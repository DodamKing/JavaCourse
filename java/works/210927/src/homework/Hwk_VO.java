package homework;

public class Hwk_VO {
	private String userID;
	private String Password;
	private int age;
	private String gender;
	private String job;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Hwk_VO [userID=" + userID + ", Password=" + Password + ", age=" + age + ", gender=" + gender + ", job="
				+ job + "]";
	}
	
}
