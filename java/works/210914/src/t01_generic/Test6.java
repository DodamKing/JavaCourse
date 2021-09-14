package t01_generic;

import java.util.ArrayList;

// 리스트의 제너릭 사용
public class Test6 {
	public static void main(String[] args) {
		Test6VO vo = new Test6VO();
		vo.setSu1(1234);
		vo.setSu2(1234.567);
		vo.setName("홍길동");
		vo.setGender(true);
		
		Test6VO vo2 = new Test6VO();
		vo2.setSu1(5678);
		vo2.setSu2(5678.9);
		vo2.setName("김말숙");
		vo2.setGender(false);
		
		System.out.println("vo: " + vo);
		System.out.println("vo2: " + vo2);
		System.out.println();
		
		// 제너릭을 사용해 볼까
		ArrayList<Test6VO> vos = new ArrayList();
		vos.add(vo);
		vos.add(vo2);
		
		int cnt = 0;
		for (Test6VO v : vos) {
			System.out.println("vos[" + cnt + "]: " + v);
			cnt++;
		}
		
		
	}
}
