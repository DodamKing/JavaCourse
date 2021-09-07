package t01_abstract;

// 추상 클래스
// 추상클래스는 공통적인 필드나 메소드를 정의
public abstract class Animal {
	int no;
	abstract void sound(); // 추상메소드
	
	void move(String name) { // 일반메소드
		System.out.println(no + "번" + " " + name + " 움직입니다.");
	}
}
