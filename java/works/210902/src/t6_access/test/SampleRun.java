package t6_access.test;

import t6_access.exam.Exam1;

public class SampleRun {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Exam1 e1 = new Exam1();
		
		System.out.println("t1.t1: " + t1.t1);
		System.out.println("t1.t2: " + t1.t2);
//		System.out.println("t1.t3: " + t1.t3);
		t1.modT1();
		t1.modT2();
//		t1.modT3();
		System.out.println();
		System.out.println("e1.ex1: " + e1.ex1);
//		System.out.println("e1.ex2: " + e1.ex2);
//		System.out.println("e1.ex3: " + e1.ex3);
		e1.modEx1();
//		e1.modEx2();
//		e1.modEx3();
		
	}
}
