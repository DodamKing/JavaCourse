package t02_vector;

import java.util.Vector;

public class Test1 {
	public static void main(String[] args) {
		Vector<String> vos  = new Vector<String>();
		vos.add("홍길동");
		vos.add("김말숙");
		vos.add("이기자");
		vos.add("강감찬");
		vos.add("소나무");
		vos.add("소나무");
		vos.add("소나무");
		vos.add("소나무");
		vos.add("소나무");
		vos.add("소나무");
//		vos.add("소나무");
		
		System.out.println("vos의 용량: " + vos.capacity());
		
		System.out.println("vos의 크기: " + vos.size());
		System.out.println("vos(0): " + vos.get(0));
		System.out.println();
		
		for (int i = 0; i<vos.size(); i++) {
			System.out.println(vos.get(i));
		}
		
		System.out.println("vos: " + vos);
		System.out.println("vos: " + vos.toString());
		
		System.out.println();
		vos.insertElementAt("오하늘", 2);
		System.out.println("vos: " + vos);
		System.out.println("vos의 크기: " + vos.size());
		System.out.println("vos의 용량: " + vos.capacity());
		
		System.out.println();
		vos.set(2, "이하늘");
		System.out.println("vos: " + vos);
		
		System.out.println();
		vos.remove(2);
		System.out.println("vos: " + vos);
		
		System.out.println();
		vos.clear();
		System.out.println("vos의 크기: " + vos.size());
		System.out.println("vos: " + vos);
		
		
	}
}
