package t02_hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Test2 {
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
		
		Iterator<Integer> iVos = vos.keySet().iterator();
		while (iVos.hasNext()) {
			String item = (String) vos.get(iVos.next());
			System.out.println(item);
		}
	}
}
