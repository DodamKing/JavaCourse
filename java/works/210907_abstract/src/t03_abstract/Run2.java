package t03_abstract;

// 각 회사(삼성, LG)에서 전화기를 생성.
// 전화기는 공통적으로 전원을 켜고(poweron) 끄는(poweroff) 기능이 존재.
// 삼성이 사진촬영기능이 우수, 엘지는 화질성능이 우수.
public class Run2 {
	public static void main(String[] args) {
		Phone samsungphone = new Samsung("홍길동");
		Phone lgphone = new Lg("김말숙");
		Phone dwphone = new DaeWoo("강감찬");
		Phone hdphone = new HyunDai("이순신");
		
		String[] title = {"삼성", "엘지", "대우", "현대"};
		Phone[] phone = {samsungphone, lgphone, dwphone, hdphone};
		
		for (int i=0; i<phone.length; i++) {
			System.out.println("--------" + title[i] + "--------");
			phone[i].powerOn();
			phone[i].soundOn();
			phone[i].function();
			phone[i].soundOff();
			phone[i].powerOff();
			System.out.println();
		}
		
		
//		samsungphone.powerOn();
//		samsungphone.soundOn();
//		samsungphone.function();
//		samsungphone.soundOff();
//		samsungphone.powerOff();
//		System.out.println();
//		
//		lgphone.powerOn();
//		lgphone.soundOn();
//		lgphone.function();
//		lgphone.soundOff();
//		lgphone.powerOff();
//		System.out.println();
//		
//		dwphone.powerOn();
//		dwphone.soundOn();
//		dwphone.function();
//		dwphone.soundOff();
//		dwphone.powerOff();
//		System.out.println();
//		
//		hdphone.powerOn();
//		hdphone.soundOn();
//		hdphone.function();
//		hdphone.soundOff();
//		hdphone.powerOff();
//		System.out.println();
		
		
	}
}
