package VO;

public class CustomerVO {
	private String name;
	private String customerID;
	private String password;
	private String email;
	private String phoneNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "CustomerVO [name=" + name + ", customerID=" + customerID + ", password=" + password + ", email=" + email
				+ ", phoneNum=" + phoneNum + "]";
	}
	
}
