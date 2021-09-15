package t01_set;

import java.util.HashSet;

public class Test2 {
	public static void main(String[] args) {
		HashSet<Integer> vos = new HashSet<Integer>();
		
		int number;
		while (true) {
			number = (int)(Math.random()*45) + 1;
			vos.add(number);
			if(vos.size()==6) break;
		}
		System.out.println(vos);
	}
}
