package t01_NullPointerException;

public class T2_ArrayExxeption {
	public static void main(String[] args) {
		try {
			String[] n = {"0", "1", "a"};
			System.out.println(n[0]);
			System.out.println(n[1]);
			System.out.println(n[2]);
			System.out.println(n[3]);
			
			String data1 = n[1];
			String data2 = n[2];

			int res = Integer.parseInt(data1) + Integer.parseInt(data2);
			System.out.println(res);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 확인");
		} catch (NumberFormatException e) {
			System.out.println("...");
		} finally {
			System.out.println("작업 종료");
		}
	}
}
