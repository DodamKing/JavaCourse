package t03_api;

import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		Object obj = new Date();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		Object obj2 = new Test1("이기자");
		System.out.println(obj2);
		
		Test1 obj3 = (Test1) obj2;
		System.out.println(obj3.name);
		
	}
}
