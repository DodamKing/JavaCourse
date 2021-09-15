package t06_String;

public class T1_charAt {
	public static void main(String[] args) {
		// 0         1         2
		// 012345678901234567890123456789
		String jumin = "981025-2012345";
		
		char gender = jumin.charAt(7);
		if (gender == '1' || gender == '3') System.out.println("성별이 남자 입니다.");
		else System.out.println("성별이 여자 입니다.");
		
	}
}
