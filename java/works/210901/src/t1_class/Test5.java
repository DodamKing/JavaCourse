package t1_class;

public class Test5 {
	int kor, eng, mat;
	String name = "관리자";
//	public Test5() {}
	
	Test5(int kor){
		this.kor = kor; //this를 쓰면 필드(전역변수), 매개변수가 지역변수
		eng = 80; // 필드
		int eng = 80; // 멤버변수 지역변수 int로 새로 선언해서
		mat = 60;
		this.mat = 60; // 위 아래 같지만 헷갈리지 않게 this를 써주자
	}
	
	Test5(int kor, int eng){
		this.kor = kor;
		this.eng = eng;
		this.mat = 50;
	}
	
	Test5(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	Test5(String name){
		this.name = name;
		this.kor = 100;
		this.eng = 70;
		this.mat = 50;
	}
}
