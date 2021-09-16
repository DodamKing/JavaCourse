package t01_thread;

import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		HashSet<Integer> vos = new HashSet<Integer>();
		
		System.out.println("이번주 행운의 번호는!!!");
		delay(10);
		
		int number;
		while (true) {
			number = (int)(Math.random()*45) + 1;
			vos.add(number);
			if(vos.size()==6) break;
		}
		
		System.out.println(vos);
	}

	private static void delay(int cnt) {
		try {
			for (int i = 0; i < cnt; i++) {
				Thread.sleep(500); // 0.5초 지연
				System.out.print(">");
			}
		}
		catch (InterruptedException e) {}
		
	}
}
