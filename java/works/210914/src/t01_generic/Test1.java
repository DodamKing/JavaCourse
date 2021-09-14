package t01_generic;

public class Test1 {
	public static void main(String[] args) {
		String[] strVar = new String[4];
		strVar[0] = "mbc";
		strVar[1] = "ksb";
		strVar[2] = "sbs";
		strVar[3] = "cjb";
		
		int[] inVar = {10, 20, 30, 40};
		double[] dblVar = {10.1, 20.2, 30.3, 40.4};
		
		Atom[] atom = {new A1(), new A2(), new A3()};
		
		Object[][] objects = {
				{"mbc", "kbs", "sbs", "cjb"},
				{10, 20, 30, 40},
				{10.1, 20.2, 30.3, 40.4},
				{new A1(), new A2(), new A3()}
		};
		
		
		int cnt=0;
		for (String str : strVar) {
			System.out.println("strVar" + "[" + cnt +  "]" + str);
			cnt++;
		}
		
		System.out.println();
		cnt=0;
		for (double dbl : dblVar) {
			System.out.printf("dblVar[%d]: %.1f\n", cnt, dbl);
			cnt++;
		}
		
		System.out.println();
		for (int i = 0; i < atom.length; i++) {
			atom[i].aa();
		}
		
		System.out.println();
		for (int i = 0; i < objects.length; i++) {
			for (int j = 0; j < objects[i].length; j++) {
				System.out.println("objects: " + objects[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}

class A1 extends Atom {

	@Override
	void aa() {
		System.out.println("A1 클래스의 aa메소드 입니다.");
	}
	
}

class A2 extends Atom {

	@Override
	void aa() {
		System.out.println("A2 클래스의 aa메소드 입니다.");
	}
	
}

class A3 extends Atom {
	
	@Override
	void aa() {
		System.out.println("A3 클래스의 aa메소드 입니다.");
	}
	
}