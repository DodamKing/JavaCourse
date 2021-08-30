package t1_memory;

public class Test2 {
	public static void main(String[] args) { // 참조형 변수이므로 주소를 비교
		String str1 = "seoul";
		String str2 = "seoul"; // 변수의 값이 같아서 같은 주소에 저장
		String str3 = new String("seoul"); // 새로운 객체를 생성해서 새로운 주소로 저장
		
		
		if (str1 == str2) System.out.println("str1와 str2는 같습니다.");
		else System.out.println("str1와 str2는 다릅니다.");			
		System.out.println();
		
		
		if (str1 == str3) System.out.println("str1와 str3는 같습니다.");
		else System.out.println("str1와 str3는 다릅니다.");			
		System.out.println();
		
		if (str1.equals(str3)) System.out.println("str1와 str3는 같습니다."); // 주소 비교할 때 equals 기본 타입이 아니면 쓰면 될 듯?
		else System.out.println("str1와 str3는 다릅니다.");			
	}
}
