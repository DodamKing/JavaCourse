package t01_NullPointerException;

public class T1_NullPointerException {
	public static void main(String[] args) {
		String data = "atom";
		String data1 = "100";
		int data2 = 100;
		String data3 = "";
		String data4 = null;
		
		try {
			System.out.println("data = " + data);
			System.out.println("data1 = " + data1.toString());
			
			System.out.println("data2 = " + data2);
			
			System.out.println("data3 = " + data3);
			System.out.println("data3 = " + data3.toString());
			
			System.out.println("data4 = " + data4);
			System.out.println("data4 = " + data4.toString());
		}
		catch (NullPointerException e) {
			System.out.println("data4가 null 입니다. null값을 String으로 변환 시도 하였습니다.");
//			e.printStackTrace();
			e.getMessage();
		}
		finally {
			System.out.println("작업이 종료 되었습니다.");
		}
	}
}
