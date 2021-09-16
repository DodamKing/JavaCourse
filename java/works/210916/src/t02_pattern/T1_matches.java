package t02_pattern;

import java.util.regex.Pattern;

public class T1_matches {
	public static void main(String[] args) {
		String str1 = "Welcome to Korea";
		String str2 = "Welcome to 코리아!";
		String str3 = "WelcometoKorea";
		String str4 = "$Welcome to_ Korea";
		String str5 = "010 4704 3246";
		String str6 = "한글 사랑";
		
		if (str1.matches(".*Korea*.")) {
			System.out.println(str1);
			System.out.println("Korea가 있네요.");
			System.out.println();
		}
		else {
			System.out.println(str1);
			System.out.println("Korea가 없네요.");
			System.out.println();
		}
		
		if (str1.matches(".*[A-Z]*.")) { 
			System.out.println(str1);
			System.out.println("영문 문자만 존재하네요.");
			System.out.println();
		}
		else {
			System.out.println(str1);
			System.out.println("영문 문자만 존재 하지 않네요.");
			System.out.println();
		}
		
		if (str1.matches(".*[a-z]*.")) { 
			System.out.println(str1);
			System.out.println("영문 문자만 존재하네요.");
			System.out.println();
		}
		else {
			System.out.println(str1);
			System.out.println("영문 문자만 존재 하지 않네요.");
			System.out.println();
		}
		
		if (Pattern.matches("^[a-z]*$", str1)) {
			System.out.println(str1);
			System.out.println("영문 소문자만 존재하네요.");
			System.out.println();
		}
		else {
			System.out.println(str1);
			System.out.println("영문 소문자만 존재하지 않네요.");
			System.out.println();
		}

		if (Pattern.matches("^[a-zA-Z ]*$", str3)) { // ^처음부터 $끝까지 공백은 띄어쓰기로 넣어 줘야 함
			System.out.println(str3);
			System.out.println("영문 문자만 존재하네요.");
			System.out.println();
		}
		else {
			System.out.println(str3);
			System.out.println("영문 문자만 존재하지 않네요.");
			System.out.println();
		}
		
		if (Pattern.matches("^[a-zA-Z$_ ]*$", str4)) {
			System.out.println(str4);
			System.out.println("영문 문자와 $, _도 존재하네요.");
			System.out.println();
		}
		else {
			System.out.println(str4);
			System.out.println("많은 문자가 있네요...");
			System.out.println();
		}
		
		if (Pattern.matches("^[0-9| ]*$", str5)) {
			System.out.println(str5);
			System.out.println("숫자만 있네요.");
			System.out.println();
		}
		else {
			System.out.println(str5);
			System.out.println("숫자만 있지는 않네요.");
			System.out.println();
		}
		
		if (Pattern.matches("^[가-힣0-9 ]*$", str6)) {
			System.out.println(str6);
			System.out.println("한글만 있네요.");
			System.out.println();
		}
		else {
			System.out.println(str6);
			System.out.println("한글만 있지는 않네요.");
			System.out.println();
		}
		
	}
}
