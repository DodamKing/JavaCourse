package t04_arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// 수행시간 비교
public class Test2 {
	public static void main(String[] args) {
		List<String> vos1 = new ArrayList<String>();
		List<String> vos2 = new Vector<String>();
		List<String> vos3 = new LinkedList<String>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			vos1.add(" ");
		}
		endTime = System.nanoTime();
		
		System.out.println("array  수행시간: " + (endTime - startTime));
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			vos2.add(" ");
		}
		endTime = System.nanoTime();
		
		System.out.println("vector 수행시간: " + (endTime - startTime));
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			vos3.add(" ");
		}
		endTime = System.nanoTime();
		
		System.out.println("llist  수행시간: " + (endTime - startTime));
	}
}
