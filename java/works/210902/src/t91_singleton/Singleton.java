package t91_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() { // getter 생성자 접근이 안되니까 static으로 클래스를 생성하지 않고 클래스명.getInstance()로 부를수 있다
		return singleton;
	}
}
