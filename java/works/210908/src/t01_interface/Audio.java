package t01_interface;

// 현 클래스는 Test 인터페이스의 구현 객체
public class Audio implements Test {
	String name;
	
	@Override
	public void swichOn() {}

	@Override
	public void swichOff() {
		System.out.println(name + " 전원을 끕니다.");
	}

	@Override
	public void swichOn(String name) {
		this.name = name;
		System.out.println(name + " 전원을 켭니다.");
	}

}
