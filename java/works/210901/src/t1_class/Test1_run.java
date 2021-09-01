package t1_class;

public class Test1_run {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		
		int tot = test1.eng + test1.kor + test1.mat;
		
		System.out.println("kor : " + test1.kor);
		System.out.println("eng : " + test1.eng);
		System.out.println("mat : " + test1.mat);
		System.out.println("tot : " + tot);
		System.out.println("sw : " + test1.sw);
		System.out.println("str : " + test1.str);
		System.out.println("mbc : " + test1.mbc);
		
	}
}
