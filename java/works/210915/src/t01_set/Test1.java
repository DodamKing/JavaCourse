package t01_set;

import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		HashSet<String> vos = new HashSet<String>();
		System.out.println(vos);
		System.out.println();
		
		vos.add("Java");
		vos.add("Database");
		vos.add("HTML5");
		vos.add("CSS3");
		vos.add("Javascript");
		vos.add("JQuery");
		System.out.println(vos.size());
		System.out.println(vos);
		System.out.println();
		
		vos.add("Java");
		System.out.println(vos.size());
		System.out.println(vos);
		System.out.println();
		
		vos.add("Java 8.2");
		System.out.println(vos.size());
		System.out.println(vos);
		System.out.println();
		
		vos.remove("Java");
		System.out.println(vos.size());
		System.out.println(vos);
		System.out.println();
		
		
	}
}
