package t02_abstract;

// 각 회사(삼성, LG)에서 전화기를 생성.
// 전화기는 공통적으로 전원을 켜고(poweron) 끄는(poweroff) 기능이 존재.
// 삼성이 사진촬영기능이 우수, 엘지는 화질성능이 우수.
public class Run2 {
	public static void main(String[] args) {
		Samsung samsung = new Samsung("홍길동");
		samsung.powerOn();
		samsung.soundOn();
		samsung.function();
		samsung.soundOff();
		samsung.powerOff();
		System.out.println();
		
		Lg lg = new Lg("김말숙");
		lg.powerOn();
		lg.soundOn();
		lg.function();
		lg.soundOff();
		lg.powerOff();
		
		
	}
}
