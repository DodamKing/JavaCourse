package t1_class;

public class Test4 { // 생성자 오버로딩
	int kor = 20; //필드
	public Test4() {} // public 접근 제한자 누구나 사용
	
	Test4(int kor) { // 매개변수
		this.kor = kor; // this 필드
	}
	
	Test4(int kor, int eng) {
		
	}
		
	Test4(double kor) { // 매개변수
		this.kor = (int) kor; // this 필드
	}
	
	Test4(int kor, double eng) {
		
	}
	
	Test4(double eng, int kor) {
		
	}
	
}
