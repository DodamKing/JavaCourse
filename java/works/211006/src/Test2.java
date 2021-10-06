import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		String str = "Welcome to 코리아!!";
		
		boolean res = str.contains("코리아");
		System.out.println(res);
		if (res) {
			System.out.println("코리아 있음");
		} else System.out.println("코리아 없음");
		
		String img = "jpgpng";
		
		String img1 = "abv.txt";
		String img2 = "abv.jpg";
		
		String[] exArr1 = img1.split("\\."); 
		String[] exArr2 = img2.split("\\.");
		
		String ex1 = exArr1[exArr1.length - 1].toLowerCase();
		String ex2 = exArr2[exArr2.length - 1].toLowerCase();
		
		if (img.contains(ex1)) {
			System.out.println("그림파일임");
		} else System.out.println("그림파일 아님");

		if (img.contains(ex2)) {
			System.out.println("그림파일임");
		} else System.out.println("그림파일 아님");
	}
}
