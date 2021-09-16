package t03_api;

public class Test1Run {
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("김말숙");
		String str3 = new String("이기자");
		String str4 = "홍길동";
		if (str1 == str4) {
			System.out.println("서로 같다.");
		} else System.out.println("서로 다르다.");
	
		if (str1.equals(str4)) {
			System.out.println("서로 같다.");
		} else System.out.println("서로 다르다.");
		
		if (str1.equals(str2)) {
			System.out.println("서로 같다.");
		} else System.out.println("서로 다르다.");
		System.out.println();
		
		Test1 obj1 = new Test1("냉장고");
		Test1 obj2 = new Test1("냉장고");
		Test1 obj3 = new Test1("오디오");
		
		if (obj1 == obj2) {
			System.out.println("서로 같다.");
		} else System.out.println("서로 다르다.");
	
		if (obj1.equals(obj2)) {
			System.out.println("서로 같다.");
		} else System.out.println("서로 다르다.");
		
		if (obj1 == obj3) {
			System.out.println("서로 같다.");
		} else System.out.println("서로 다르다.");
		
		if (obj1.equals(obj3)) {
			System.out.println("서로 같다.");
		} else System.out.println("서로 다르다.");
		System.out.println();
		
		
		if (obj1.name.equals(obj2.name)) {
			System.out.println("저장된 필드값이 같다.");
		} else System.out.println("저장된 필드값이 다르다.");
		
		if (obj1.name.equals(obj3.name)) {
			System.out.println("저장된 필드값이 같다.");
		} else System.out.println("저장된 필드값이 다르다.");
	}
}
