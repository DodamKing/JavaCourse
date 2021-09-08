package t01_NullPointerException;

public class T3_numberFormatException {
	public static void main(String[] args) {
		int a = 500;
		String data1 = "100";
		String data2 = "seoul100";
		
		try {
			System.out.println(data1+a);
			System.out.println(data2);
			
			int intValue1 = Integer.parseInt(data1) + a;
			System.out.println(intValue1);
			
			int intValue2 = Integer.parseInt(data2) + a;
			System.out.println(intValue2);
			
		} catch (Exception e) {
			System.out.println("data2의 입렵값을 확인하세요");
		} finally {
			System.out.println("작업종료");
		}
	}
}
