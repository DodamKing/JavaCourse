package t03_abstract;

public abstract class Phone {
	String name;
	
	abstract void function();
	
	void powerOn() {
		System.out.println("전화기의 전원을 켰습니다.");
	}
	
	void powerOff() {
		System.out.println("전화기의 전원을 껐습니다.");
	}
	
	void soundOn() {
		System.out.println(name + "님이 통화를 시작했습니다.");
	}
	
	void soundOff() {
		System.out.println(name + "님이 통화를 종료했습니다.");
	}
	
	
}
