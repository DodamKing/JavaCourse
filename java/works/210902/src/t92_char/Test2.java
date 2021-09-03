package t92_char;
// String -> char[]
public class Test2 {
	public static void main(String[] args) {
		String str = "seoul";
		System.out.println("str: " + str);
		
		System.out.println(str.charAt(0));
		
		// 문자열을 배열로 처리해서 하나씩 출력: charAt()
		for (int i=0; i<str.length(); i++) {
			System.out.println("str[] = " + str.charAt(i));
		}
		
		char[] charArr = str.toCharArray();
		for (int i=0; i<charArr.length; i++) {
			System.out.println("charArr = " + charArr[i]);
		}
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'o') {
				System.out.println("o의 인덱스: " + i);
				break;
			}
		}
		
		// char형 비교: compare()
		for (int i=0; i<charArr.length; i++) {
			if (Character.compare(charArr[i], 'o') == 0) {
				System.out.println("o의 인덱스: " + i);
			}
		}
	}
}
