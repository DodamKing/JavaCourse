package t1_array;

public class Test8 {
	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "Java";
		str[1] = "C++";
		str[2] = "C#";
		
//		for (int i=0; i<str.length; i++) {
//			for (int j=0; j<str[i].length; j++) {
//				System.out.printf("str[%d][%d] = %d\n", i, j, str[i][j]);
//			}
//		}
		for (int i=0; i<str.length; i++) System.out.printf("str[%d] = %s\n", i, str[i]);
	}
}
