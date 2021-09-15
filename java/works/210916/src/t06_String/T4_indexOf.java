package t06_String;

public class T4_indexOf {
	public static void main(String[] args) {
		String str1 = "Welcome to 코리아!";
		
		int loc = str1.indexOf("코리아");
		System.out.println(loc);
		loc = str1.indexOf("일본");
		System.out.println(loc);
		loc = str1.indexOf(" ");
		System.out.println(loc);
	}
}
