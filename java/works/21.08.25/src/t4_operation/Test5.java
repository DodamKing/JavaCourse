package t4_operation;

public class Test5 {
	public static void main(String[] args) {
		int x = -100;
		int res = -x;
		System.out.println("res = " + res);
		
		res++;
		System.out.println("res = "+ res);
		
		++res;
		System.out.println("res = "+ res);
		
		int res2, res3;
		res2 = res++;
		res3 = ++res;
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
		
		res3 += 1;
		System.out.println(res3);
		
	}
}
