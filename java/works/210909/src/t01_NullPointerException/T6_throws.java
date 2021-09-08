package t01_NullPointerException;

public class T6_throws {
	public static void main(String[] args) {
		try {
//			Class.forName("java.lang.String2");
			findClass();
			System.out.println("String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("String 클래스가 존재 하지 않습니다.");
//			e.printStackTrace();
		}
	}
	static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}

