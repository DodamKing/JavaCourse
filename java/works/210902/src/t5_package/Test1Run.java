package t5_package;

import t4_package.Test1;
import t4_package.Test2;

//import t4_package.Test1;
//import t4_package.Test2;
//import t4_package.*;

public class Test1Run {
	public static void main(String[] args) {
		int add, sub, mul;
		double div;
		Test1 t1 = new Test1();
		
		add = t1.add(10, 20);
		sub = t1.sub(10, 20);
		mul = t1.mul(10, 20);
		div = t1.div(10, 20);
		
		Test2 t2 = new Test2();
		t2.prn(add, mul, sub, div);		
	}
}
