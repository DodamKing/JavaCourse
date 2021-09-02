package t7_getter_setter;

public class Test2 {
	private String name;
	private int age;
	private boolean gender;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge(String mid) {
		if (mid.equals("admin")) {
			return age;
		}
		else {
			return -1;
		}
	}
	public void setAge(int age) {
		if (age >= 20 && age < 40) this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
