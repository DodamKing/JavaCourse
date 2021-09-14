package t01_generic;

import java.util.ArrayList;

public class Test4 {
	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		arrList.add(123);
		arrList.add(123.4);
		arrList.add("mbc");
		arrList.add(true);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		System.out.println();
		int list0 = (int) arrList.get(0);
		double list1 = (double) arrList.get(1);
		String list2 = (String) arrList.get(2);
		boolean list3 = (boolean) arrList.get(3);
		
		System.out.println(list0 + 100);
		System.out.println(list1 + 100.5);
		System.out.println(list2 + " tv");
		System.out.println(list3);
	}
}
