package t01_set;

import java.util.HashSet;
import java.util.Iterator;

// Iterator 반복지시자
// hasNext() 자료가 있니?
// next() 데이터 처리 읽기
public class Test3 {
	public static void main(String[] args) {
		HashSet<Integer> vos = new HashSet<Integer>();
		vos.add(10);
		vos.add(50);
		vos.add(30);
		vos.add(20);
		vos.add(90);
		vos.add(70);
		vos.add(1);
		vos.add(16);
		System.out.println(vos);
		System.out.println();
		
		Iterator<Integer> iVos = vos.iterator();
		while(iVos.hasNext()) {
			int item = iVos.next();
			System.out.println(item);
		}
		
	}
}
