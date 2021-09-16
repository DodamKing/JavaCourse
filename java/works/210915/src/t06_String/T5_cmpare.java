package t06_String;

public class T5_cmpare {
	public static void main(String[] args) {
		String str1 = "Hello!!";
		String str2 = "Hello!";
		String str3 = "Okay ~ Bye!!";
		String str4 = "A Hello!";
		String str5 = "B Hello!";
		String str6 = "Hello! C";
		String str7 = "  Hello! ";
		String str8 = " Hello! ";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));
		System.out.println(str1.compareTo(str6));
		System.out.println(str1.compareTo(str7));
		System.out.println(str1.compareTo(str8));
		System.out.println();
		
		System.out.println(str3.startsWith(str1));
		System.out.println(str1.endsWith(str3));
		System.out.println();
		
		System.out.println(str1.concat(str3));
		System.out.println();
		
		System.out.println(str8);
		System.out.println(str8.trim());
		System.out.println(str8.strip());
		System.out.println(str7);
		System.out.println(str7.trim());
		System.out.println(str7.strip());
		System.out.println(str7.stripLeading());
		System.out.println(str7.stripTrailing());
		System.out.println(str7.stripIndent());
		
		
	}
}
