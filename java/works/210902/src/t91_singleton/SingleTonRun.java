package t91_singleton;

public class SingleTonRun {
	public static void main(String[] args) {
//		Singleton singleton = new Singleton(); 접근 불가
		Singleton sing1 = Singleton.getInstance();
		System.out.println(sing1);
		System.out.println();
		
		Singleton sing2 = Singleton.getInstance();
		System.out.println(sing2);
		System.out.println();
		
		if (sing1 == sing2) {
			System.out.println("sing1과 sing2는 같은 객체입니다.");
			System.out.println();
		}
		else {
			System.out.println("sing1과 sing2는 다른 객체입니다.");
			System.out.println();
		}
		
	}
}
