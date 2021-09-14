package t01_generic;

public class Test3 {
	public static void main(String[] args) {
		String[] str = {"mbc", "kbs", "sbs"};
		
		
		Object[] objVar = {123, 123.4, "sbs", true};
		for (int i = 0; i < objVar.length; i++) {
			Object object = objVar[i];
			System.out.println("object[" + i + "]: " + object);
		}
		
//		String[] strVar = new String[4];
//		for (int i = 0; i < strVar.length; i++) {
//			strVar[i] = (String) objVar[i]; // 강제 캐스팅에서 오류남
//		}
//		for (int i = 0; i < strVar.length; i++) {
//			String string = strVar[i];
//			System.out.println("strVar[" + i + "]: " + string);
//		}
		
		
		
		
	}
}
