package t7_getter_setter;

public class Test2Run {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		String name = t2.getName();
		System.out.println("이름: " + name);
		int age = t2.getAge("atom");
		if (age != -1) {
			System.out.println("나이: " + age);
		}
		else System.out.println("관리자에게만 나이를 공개합니다.");
		
		System.out.println();
		
		t2.setName("김말술");
		name = t2.getName();
		System.out.println("이름: " + name);
		
		t2.setAge(50);
		age = t2.getAge("admin");
		if (age != -1) {
			System.out.println("나이: " + age);
		}
		else System.out.println("관리자에게만 나이를 공개합니다.");
		
	}
	
}
