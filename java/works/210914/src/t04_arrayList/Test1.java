package t04_arrayList;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> vos = new ArrayList<String>();
//		vos.ensureCapacity(10);
//		System.out.println("vos의 용량: " + vos.ensureCapacity(100));
		System.out.println("vos의 크기: " + vos.size());
		System.out.println("vos: " + vos);
		
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
		
		System.out.println("vos의 크기: " + vos.size());
		System.out.println("vos: " + vos);
		System.out.println();
		
		vos.set(9, "오하늘");
		System.out.println("vos의 크기: " + vos.size());
		System.out.println("vos: " + vos);
		System.out.println();
		
		vos.remove(8);
		System.out.println("vos의 크기: " + vos.size());
		System.out.println("vos: " + vos);
		System.out.println();
		
		System.out.println(vos.get(2));
	}
}
