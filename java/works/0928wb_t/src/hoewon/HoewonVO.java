package hoewon;

public class HoewonVO {
	private int idx;
	private String name;
	private int age;
	private String address;
	
	@Override
	public String toString() {
		return "HoewonVO [idx=" + idx + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
