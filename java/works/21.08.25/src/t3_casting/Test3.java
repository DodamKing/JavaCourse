package t3_casting;

public class Test3 {
	public static void main(String[] args) {
		int i1 = 3 + 7;
		String str1 = "3" + 7;
		System.out.println(i1);
		System.out.println(str1);
		
		String str2 = 3 + "7";
		System.out.println(str2);
		
//		String str3 = 3 + 7;

		String str3 = 10 + "2" + 8;
		System.out.println(str3);
		System.out.println();
		
		String str4 = "2" + (8 + 10);
		System.out.println(str4);
		
	}
}
