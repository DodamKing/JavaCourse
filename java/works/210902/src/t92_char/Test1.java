package t92_char;

// char[] -> String
public class Test1 {
	public static void main(String[] args) {
		char[] charArr = new char[] {'s', 'e', 'o', 'u', 'l'};
		
		for (int i=0; i<charArr.length; i++) {
			System.out.print("char[" + i + "] =" + " " + charArr[i] + " "); 
		}
		System.out.println();
		
		System.out.println("cahrArr.toString(): " + charArr.toString());
		System.out.println();
		
		
		// char[] -> String 형변환
		String str = new String(charArr);
		System.out.println(str);
	}
}
