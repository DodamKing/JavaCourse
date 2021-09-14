package t01_generic;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		arrList.add("123");
		arrList.add("123.4");
		arrList.add("mbc");
		arrList.add("true");
		

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
			
		}
		
		String[] strVar = new String[arrList.size()];
		for (int i = 0; i < strVar.length; i++) {
			strVar[i] = arrList.get(i);
		}
		
		System.out.println();
		int cnt = 0;
		for (String string : strVar) {
			System.out.println(string);
		}
	}
}
