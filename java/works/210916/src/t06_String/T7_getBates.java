package t06_String;

public class T7_getBates {
	public static void main(String[] args) {
		String str = "안녕하세요!";
		
		byte[] b = str.getBytes();
		
		System.out.println(b.length);
		System.out.println(str.length());
		
	}
}
