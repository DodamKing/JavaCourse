package read;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력: ");
		String img = scanner.next();
		
		String[] extArr = img.split("\\."); // 제어문자
		String ext = extArr[extArr.length - 1].toLowerCase();
		if (ext.equals("gif") || ext.equals("jpg") || ext.equals("png")) {
			System.out.println("등록");
		} else System.out.println("이미지 파일 아님");
		
		scanner.close();
	}
}
