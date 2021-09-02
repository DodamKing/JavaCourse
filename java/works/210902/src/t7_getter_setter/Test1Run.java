package t7_getter_setter;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		String name = t1.getName();
		System.out.println("이름: " + name);
		int age = t1.getAge();
		System.out.println("나이: " + age);
		
		System.out.println();
		
		t1.setName("김말술");
		name = t1.getName();
		System.out.println("이름: " + name);

		t1.setAge(50);
		age = t1.getAge();
		System.out.println("나이: " + age);
		
		
	}
}
