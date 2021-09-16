package t02_pattern;

import java.util.regex.Pattern;

public class T2_maches2 {
	public static void main(String[] args) {
		String str1 = "010-3453-2704";
		String str2 = "02-112-4567";
		String regex1 = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";
		
		if (Pattern.matches(regex1, str1)) {
			System.out.println("전화번호 형식");
		}
		else System.out.println("전화번호 형식 아님");
		
		if (Pattern.matches(regex1, str2)) {
			System.out.println("전화번호 형식");
		}
		else System.out.println("전화번호 형식 아님");
		
		
		//
		String str3 = "문자자료123 - Alpha : ~!@#$%^&*-_=+/\'\"\\?＠※㉾【┐Ⅹ";
		System.out.println("원본자료: " + str3);
		System.out.println("구두점 제거: " + str3.replaceAll("\\p{Punct}", "")); // 특수문자 제외 구두점(키보드에 있는 특수문자)만 가능
		System.out.println("숫자, 한글, 영어대소문자, 공백 빼고 다 제거: " + str3.replaceAll("[^0-9a-zA-Z가-힣 ]", "")); // 다 제거 ^를 쓰면 빼고임
		
	}
}
