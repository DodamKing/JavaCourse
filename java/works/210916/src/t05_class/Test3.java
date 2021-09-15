package t05_class;

import java.io.File;

public class Test3 {
	public static void main(String[] args) {
		Class clazz = Test1.class;
//		File file = new File("./images/1.jpg");
		
		String path1 = clazz.getResource("./images/1.jpg").getPath();
		System.out.println(path1);
	}
}
