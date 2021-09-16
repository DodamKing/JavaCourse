package t01_set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Iterator 반복지시자
// hasNext() 자료가 있니?
// next() 데이터 처리 읽기
public class Test4 {
	public static void main(String[] args) {
		List<Integer> vos = new ArrayList<Integer>();
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
