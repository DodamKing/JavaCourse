package t02_hashMap;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> vos = new HashMap<Integer, String>();
		
		vos.put(100, "Java");
		vos.put(200, "Java");
		vos.put(150, "Ajax");
		vos.put(300, "Javascript");
		vos.put(250, "Database");
		vos.put(400, "HTML5");
		vos.put(350, "CSS3");
		
		System.out.println(vos);
		System.out.println();
		
		String name = vos.get(100);
		System.out.println(name);
		name = vos.get(110);
		System.out.println(name);
		name = vos.get(350);
		System.out.println(name);
		
		vos.put(500, "Python");
		System.out.println(vos);
		
		vos.remove(500);
		System.out.println(vos);
		
		vos.clear();
		System.out.println(vos);
		
		
	}
}
